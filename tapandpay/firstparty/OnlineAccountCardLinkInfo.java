package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dexo;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class OnlineAccountCardLinkInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexo();
    public final int a;
    public final int b;

    public OnlineAccountCardLinkInfo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OnlineAccountCardLinkInfo) {
            OnlineAccountCardLinkInfo onlineAccountCardLinkInfo = (OnlineAccountCardLinkInfo) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(onlineAccountCardLinkInfo.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(onlineAccountCardLinkInfo.b))) {
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
        arwa.b("accountType", Integer.valueOf(this.a), arrayList);
        arwa.b("status", Integer.valueOf(this.b), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
