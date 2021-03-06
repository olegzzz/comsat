/*
 * COMSAT
 * Copyright (c) 2013-2014, Parallel Universe Software Co. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 3.0
 * as published by the Free Software Foundation.
 */
/*
 * Based on the corresponding class in Spring Boot Samples.
 * Copyright the original author(s).
 * Released under the ASF 2.0 license.
 */
package comsat.sample.data.jpa.domain;

import java.io.Serializable;

public class RatingCount implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Rating rating;

    private final long count;

    public RatingCount(Rating rating, long count) {
        this.rating = rating;
        this.count = count;
    }

    public Rating getRating() {
        return this.rating;
    }

    public long getCount() {
        return this.count;
    }
}
