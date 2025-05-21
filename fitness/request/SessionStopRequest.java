package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgit;
import defpackage.bglp;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionStopRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglp();
    public final String a;
    public final String b;
    public final bgit c;

    public SessionStopRequest(String str, String str2, bgit bgitVar) {
        this.a = str;
        this.b = str2;
        this.c = bgitVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionStopRequest)) {
            return false;
        }
        SessionStopRequest sessionStopRequest = (SessionStopRequest) obj;
        return arwb.b(this.a, sessionStopRequest.a) && arwb.b(this.b, sessionStopRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("name", this.a, arrayList);
        arwa.b("identifier", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        bgit bgitVar = this.c;
        arxc.D(parcel, 3, bgitVar == null ? null : bgitVar.a);
        arxc.c(parcel, a);
    }

    public SessionStopRequest(String str, String str2, IBinder iBinder) {
        bgit bgitVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            bgitVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
            bgitVar = queryLocalInterface instanceof bgit ? (bgit) queryLocalInterface : new bgit(iBinder);
        }
        this.c = bgitVar;
    }
}
