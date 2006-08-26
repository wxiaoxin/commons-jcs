package org.apache.jcs.auxiliary.disk.indexed;

/*
 * Copyright 2001-2004 The Apache Software Foundation. Licensed under the Apache License, Version
 * 2.0 (the "License") you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

import java.io.Serializable;

/**
 * Resembles a cached image.
 */
public class DiskTestObject
    implements Serializable
{
    private static final long serialVersionUID = 1L;

    /**
     * Key
     */
    public Integer id;

    /**
     * Byte size
     */
    public byte[] imageBytes;

    /**
     * @param id
     * @param imageBytes
     */
    public DiskTestObject( Integer id, byte[] imageBytes )
    {
        this.id = id;
        this.imageBytes = imageBytes;
    }
}