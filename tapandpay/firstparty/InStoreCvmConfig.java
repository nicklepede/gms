package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.dhio;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InStoreCvmConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhio();
    final boolean a;
    final int b;
    final int c;
    final int d;
    final boolean e;

    public InStoreCvmConfig(boolean z, int i, int i2, int i3, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InStoreCvmConfig) {
            InStoreCvmConfig inStoreCvmConfig = (InStoreCvmConfig) obj;
            if (this.a == inStoreCvmConfig.a && this.b == inStoreCvmConfig.b && this.d == inStoreCvmConfig.d && this.c == inStoreCvmConfig.c && this.e == inStoreCvmConfig.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.c), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("requireCdcvmPassing", Boolean.valueOf(this.a), arrayList);
        atyp.b("cdcvmExpirationInSecs", Integer.valueOf(this.b), arrayList);
        atyp.b("unlockedTapLimit", Integer.valueOf(this.c), arrayList);
        atyp.b("cdcvmTapLimit", Integer.valueOf(this.d), arrayList);
        atyp.b("prioritizeOnlinePinOverCdcvm", Boolean.valueOf(this.e), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.o(parcel, 5, this.d);
        atzr.e(parcel, 6, this.e);
        atzr.c(parcel, a);
    }
}
