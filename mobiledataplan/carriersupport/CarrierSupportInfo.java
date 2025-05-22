package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgkp;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CarrierSupportInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgkp();
    public String a;
    public String b;
    public CarrierSupportChannel[] c;

    public CarrierSupportInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportInfo) {
            CarrierSupportInfo carrierSupportInfo = (CarrierSupportInfo) obj;
            if (atyq.b(this.a, carrierSupportInfo.a) && atyq.b(this.b, carrierSupportInfo.b) && Arrays.equals(this.c, carrierSupportInfo.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("TitleMessage", this.a, arrayList);
        atyp.b("LanguageCode", this.b, arrayList);
        atyp.b("SupportChannels", Arrays.toString(this.c), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.J(parcel, 3, this.c, i);
        atzr.c(parcel, a);
    }

    public CarrierSupportInfo(String str, String str2, CarrierSupportChannel[] carrierSupportChannelArr) {
        this.a = str;
        this.b = str2;
        this.c = carrierSupportChannelArr;
    }
}
