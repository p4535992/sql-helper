package com.ymonnier.sql.help.generator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Project SqlHelper.
 * Package com.ymonnier.sql.help.generator.annotations.
 * File Extends.java.
 * Created by Ysee on 14/03/2017 - 23:05.
 * www.yseemonnier.com
 * https://github.com/YMonnier
 */

/**
 * Extends annotation can be apply on a Class.
 * This Annotation allows to create the
 * CRUD operations for the specific Class.
 * @see Attr
 * @see com.ymonnier.sql.help.service.CrudService
 * @see com.ymonnier.sql.help.service.CrudServiceBean
 */
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.SOURCE)
public @interface Extends {
}
