package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cikl;
import defpackage.elgo;
import defpackage.elpg;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SafeParcelableDataElements extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cikl();
    private final List a;

    public SafeParcelableDataElements(List list) {
        this.a = list;
    }

    public final List a() {
        List list = this.a;
        if (list != null) {
            return list;
        }
        int i = elgo.d;
        return elpg.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SafeParcelableDataElements) {
            return a().equals(((SafeParcelableDataElements) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, a(), false);
        atzr.c(parcel, a);
    }
}
