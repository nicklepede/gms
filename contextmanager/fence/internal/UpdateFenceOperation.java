package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahgg;
import defpackage.arxc;
import defpackage.atpo;
import defpackage.atpq;
import defpackage.atqf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class UpdateFenceOperation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atqf();
    public final int a;
    public final ContextFenceRegistrationStub b;
    public atpq c;
    public final ahgg d;
    public final PendingIntent e;
    public final String f;
    public final long g;
    public final long h;

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, ahgg ahggVar, PendingIntent pendingIntent, String str, long j, long j2) {
        this.a = i;
        this.b = contextFenceRegistrationStub;
        this.c = null;
        this.d = ahggVar;
        this.e = pendingIntent;
        this.f = str;
        this.g = j;
        this.h = j2;
    }

    public static final UpdateFenceOperation a(String str, long j, ContextFenceStub contextFenceStub, PendingIntent pendingIntent) {
        return new UpdateFenceOperation(2, new ContextFenceRegistrationStub(str, j, contextFenceStub), (ahgg) null, pendingIntent, (String) null, -1L, -1L);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.t(parcel, 3, this.b, i, false);
        atpq atpqVar = this.c;
        arxc.D(parcel, 4, atpqVar == null ? null : atpqVar.asBinder());
        arxc.t(parcel, 5, this.e, i, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.q(parcel, 7, this.g);
        arxc.q(parcel, 8, this.h);
        arxc.c(parcel, a);
    }

    public UpdateFenceOperation(ContextFenceRegistrationStub contextFenceRegistrationStub, atpq atpqVar) {
        this.a = 1;
        this.b = contextFenceRegistrationStub;
        this.c = atpqVar;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = -1L;
        this.h = -1L;
    }

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, IBinder iBinder, PendingIntent pendingIntent, String str, long j, long j2) {
        atpq atpoVar;
        this.a = i;
        this.b = contextFenceRegistrationStub;
        if (iBinder == null) {
            atpoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
            atpoVar = queryLocalInterface instanceof atpq ? (atpq) queryLocalInterface : new atpo(iBinder);
        }
        this.c = atpoVar;
        this.d = null;
        this.e = pendingIntent;
        this.f = str;
        this.g = j;
        this.h = j2;
    }
}
