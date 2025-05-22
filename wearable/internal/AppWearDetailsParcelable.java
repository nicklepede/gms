package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmsl;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AppWearDetailsParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmsl();
    public final boolean a;
    public final List b;

    public AppWearDetailsParcelable(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AppWearDetailsParcelable appWearDetailsParcelable = (AppWearDetailsParcelable) obj;
            if (this.a == appWearDetailsParcelable.a && Objects.equals(this.b, appWearDetailsParcelable.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.a + ", watchfaceCategories=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.x(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
