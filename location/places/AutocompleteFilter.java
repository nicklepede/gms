package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.ccmi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class AutocompleteFilter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ccmi();
    final int a;
    final boolean b;
    final List c;
    final String d;
    public final int e;

    public AutocompleteFilter(int i, boolean z, List list, String str) {
        this.a = i;
        this.c = list;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            i2 = ((Integer) list.iterator().next()).intValue();
        }
        this.e = i2;
        this.d = str;
        if (i <= 0) {
            this.b = !z;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompleteFilter)) {
            return false;
        }
        AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
        return this.e == autocompleteFilter.e && this.b == autocompleteFilter.b && this.d == autocompleteFilter.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Integer.valueOf(this.e), this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("includeQueryPredictions", Boolean.valueOf(this.b), arrayList);
        atyp.b("typeFilter", Integer.valueOf(this.e), arrayList);
        atyp.b("country", this.d, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.b);
        atzr.E(parcel, 2, this.c);
        atzr.v(parcel, 3, this.d, false);
        atzr.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        atzr.c(parcel, a);
    }
}
