package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.boty;
import defpackage.fxxm;
import defpackage.fybh;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new boty();
    public final byte[] a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final String g;

    public RegistrationRequest(byte[] bArr, byte[] bArr2, String str, String str2, List list, String str3, String str4) {
        boolean z;
        fxxm.f(bArr, "credentials");
        fxxm.f(bArr2, "matcher");
        fxxm.f(str, "type");
        fxxm.f(str2, "requestType");
        fxxm.f(list, "protocolTypes");
        fxxm.f(str3, "id");
        fxxm.f(str4, "fulfillmentActionName");
        this.a = bArr;
        this.b = bArr2;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = str3;
        this.g = str4;
        if (!fybh.y(str2) && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!fybh.y((String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = !fybh.y(this.c) && this.d.length() == 0 && this.e.isEmpty();
        if (z || z2) {
            return;
        }
        throw new IllegalArgumentException("Either type: " + this.c + ", or requestType: " + this.d + " and protocolTypes: " + this.e + " must be specified, but all were blank, or for protocolTypes, empty or full of blank elements.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.x(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.c(parcel, a);
    }
}
