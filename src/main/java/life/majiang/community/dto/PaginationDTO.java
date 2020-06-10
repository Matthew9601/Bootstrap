package life.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private Boolean showPrevious;
    private Boolean showFirstPage;
    private Boolean showNext;
    private Boolean showEndPage;
    private Integer page;
    private Integer totalPage;
    private List<Integer> pages = new ArrayList<>();

    public void setPagination(Integer totalCount, Integer page, Integer size) {
        totalPage = totalCount % size == 0 ? totalCount / size : totalCount / size + 1;

        if(page < 1){
            page = 1;
        }

        if(page > totalPage){
            page = totalPage;
        }
        this.page = page;
        pages.add(page);
        for(int i = 1; i <= 3; ++i){
            if(page - i > 0){
                pages.add(0, page - i);
            }
            if(page + i <= totalPage){
                pages.add(page + i);
            }
        }
        // Show previous page or not
        showPrevious = page != 1;

        // Show next page or not
        showNext = !page.equals(totalPage);

        // Show first page or not
        showFirstPage = !pages.contains(1);

        // Show last page or not
        showEndPage = !pages.contains(totalPage);

    }
}
