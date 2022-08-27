package Bidirectional.entity;

import javax.persistence.*;

/**
 * @author 冰
 */
@Entity
@Table(name = "score")
@TableGenerator(name = "score_gen",
        table = "tb_generator",
        pkColumnName = "generator_name",
        valueColumnName = "generator_value",
        pkColumnValue = "Score_PK",
        allocationSize = 1
)
public class ScoreEO14 {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "score_gen")
    private Integer id;
    private String c_code;
    private String c_name;
    private String s_code;
    private String s_name;
    private Integer score;

    public ScoreEO14() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getC_code() {
        return c_code;
    }

    public void setC_code(String c_code) {
        this.c_code = c_code;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getS_code() {
        return s_code;
    }

    public void setS_code(String s_code) {
        this.s_code = s_code;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ScoreEO14{" +
                "c_code='" + c_code + '\'' +
                ", c_name='" + c_name + '\'' +
                ", s_code='" + s_code + '\'' +
                ", s_name='" + s_name + '\'' +
                ", score=" + score +
                '}';
    }
}
