package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.binj;
import defpackage.biqf;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionStopRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqf();
    public final String a;
    public final String b;
    public final binj c;

    public SessionStopRequest(String str, String str2, binj binjVar) {
        this.a = str;
        this.b = str2;
        this.c = binjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionStopRequest)) {
            return false;
        }
        SessionStopRequest sessionStopRequest = (SessionStopRequest) obj;
        return atyq.b(this.a, sessionStopRequest.a) && atyq.b(this.b, sessionStopRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("name", this.a, arrayList);
        atyp.b("identifier", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        binj binjVar = this.c;
        atzr.D(parcel, 3, binjVar == null ? null : binjVar.a);
        atzr.c(parcel, a);
    }

    public SessionStopRequest(String str, String str2, IBinder iBinder) {
        binj binjVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            binjVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
            binjVar = queryLocalInterface instanceof binj ? (binj) queryLocalInterface : new binj(iBinder);
        }
        this.c = binjVar;
    }
}
