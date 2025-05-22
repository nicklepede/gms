package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.dhhx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ContactlessSetupItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dhhx();
    final int a;
    final int b;

    public ContactlessSetupItem(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactlessSetupItem) {
            ContactlessSetupItem contactlessSetupItem = (ContactlessSetupItem) obj;
            if (this.a == contactlessSetupItem.a && this.b == contactlessSetupItem.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("type", Integer.valueOf(this.a), arrayList);
        atyp.b("status", Integer.valueOf(this.b), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
