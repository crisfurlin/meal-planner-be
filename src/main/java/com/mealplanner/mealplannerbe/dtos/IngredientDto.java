package com.mealplanner.mealplannerbe.dtos;

public class IngredientDto {

    private Integer id;
    private String quantity;
    private String unit;
    private String name;
    private Integer recipeId;

    public IngredientDto(Integer id, String quantity, String unit, String name, Integer recipeId) {
        this.id = id;
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
        this.recipeId = recipeId;
    }

    public IngredientDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }
}
