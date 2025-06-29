package bc2504p-sb;
import java.util.List;



public class ShoppingMall {
  private String name;
  private Integer area;
  private String cinema;
  @JsonProperty(value = "shopcategory")
  private List<String> ShopCategories;

  // ! List is same as Array, in Serialization perspective.

  @Getter
  public Static class Cinema {
    private String name;
    private String openedDate;
    private List<Films> releasedFilms;

   @Getter
    public Static class Films {
      private String name;
      private String releaseDate;

    }
  }
}
