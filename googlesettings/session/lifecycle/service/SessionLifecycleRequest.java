package com.google.android.gms.googlesettings.session.lifecycle.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bjvs;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SessionLifecycleRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bjvs();
    public final String a;
    public final int b;
    public final long c;

    public SessionLifecycleRequest(String str, int i, long j) {
        fvbo.f(str, "sessionId");
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionLifecycleRequest)) {
            return false;
        }
        SessionLifecycleRequest sessionLifecycleRequest = (SessionLifecycleRequest) obj;
        return fvbo.n(this.a, sessionLifecycleRequest.a) && this.b == sessionLifecycleRequest.b && this.c == sessionLifecycleRequest.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.c;
        return ((hashCode + this.b) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionLifecycleRequest(sessionId=" + this.a + ", stateId=" + this.b + ", timeoutMillis=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
