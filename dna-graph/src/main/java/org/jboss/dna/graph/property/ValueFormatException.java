/*
 * JBoss DNA (http://www.jboss.org/dna)
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * See the AUTHORS.txt file in the distribution for a full listing of 
 * individual contributors. 
 *
 * JBoss DNA is free software. Unless otherwise indicated, all code in JBoss DNA
 * is licensed to you under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * JBoss DNA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.dna.graph.property;

/**
 * @author Randall Hauch
 */
public class ValueFormatException extends RuntimeException {

    /**
     */
    private static final long serialVersionUID = 1L;

    private final Object value;
    private final PropertyType targetType;

    /**
     * @param value the value that was not able to be converted
     * @param targetType the {@link PropertyType} to which the value was being converted
     */
    public ValueFormatException( Object value,
                                 PropertyType targetType ) {
        this.value = value;
        this.targetType = targetType;
    }

    /**
     * @param value the value that was not able to be converted
     * @param targetType the {@link PropertyType} to which the value was being converted
     * @param message the message
     */
    public ValueFormatException( Object value,
                                 PropertyType targetType,
                                 String message ) {
        super(message);
        this.value = value;
        this.targetType = targetType;
    }

    /**
     * @param value the value that was not able to be converted
     * @param targetType the {@link PropertyType} to which the value was being converted
     * @param cause the cause of the exception
     */
    public ValueFormatException( Object value,
                                 PropertyType targetType,
                                 Throwable cause ) {
        super(cause);
        this.value = value;
        this.targetType = targetType;
    }

    /**
     * @param value the value that was not able to be converted
     * @param targetType the {@link PropertyType} to which the value was being converted
     * @param message the message
     * @param cause the cause of the exception
     */
    public ValueFormatException( Object value,
                                 PropertyType targetType,
                                 String message,
                                 Throwable cause ) {
        super(message, cause);
        this.value = value;
        this.targetType = targetType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Get the {@link PropertyType} to which the {@link #getValue() value} was being converted.
     * 
     * @return the target type
     */
    public PropertyType getTargetType() {
        return targetType;
    }

    /**
     * Get the original value that was being converted.
     * 
     * @return the value
     */
    public Object getValue() {
        return value;
    }
}