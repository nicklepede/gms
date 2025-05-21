package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmnf;
import defpackage.fvbo;
import defpackage.fvfj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmnf();
    public final byte[] a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final String g;

    public RegistrationRequest(byte[] bArr, byte[] bArr2, String str, String str2, List list, String str3, String str4) {
        boolean z;
        fvbo.f(bArr, "credentials");
        fvbo.f(bArr2, "matcher");
        fvbo.f(str, "type");
        fvbo.f(str2, "requestType");
        fvbo.f(list, "protocolTypes");
        fvbo.f(str3, "id");
        fvbo.f(str4, "fulfillmentActionName");
        this.a = bArr;
        this.b = bArr2;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = str3;
        this.g = str4;
        if (!fvfj.y(str2) && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!fvfj.y((String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = !fvfj.y(this.c) && this.d.length() == 0 && this.e.isEmpty();
        if (z || z2) {
            return;
        }
        throw new IllegalArgumentException("Either type: " + this.c + ", or requestType: " + this.d + " and protocolTypes: " + this.e + " must be specified, but all were blank, or for protocolTypes, empty or full of blank elements.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.x(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }
}
