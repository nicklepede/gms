package com.google.android.gms.location.places;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class AbstractPlaceFilter extends AbstractSafeParcelable {
    static Set a(List list) {
        return (list == null || list.isEmpty()) ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(new HashSet(list));
    }
}
