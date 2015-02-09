package us.kulba.starter.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * BaseObject is a ..
 *
 * @author James Kulba, jkulba@gmail.com
 */

public class BaseObject implements Serializable {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }

}