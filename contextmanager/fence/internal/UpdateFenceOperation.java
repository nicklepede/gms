package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajgw;
import defpackage.atzr;
import defpackage.avtr;
import defpackage.avtt;
import defpackage.avui;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class UpdateFenceOperation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avui();
    public final int a;
    public final ContextFenceRegistrationStub b;
    public avtt c;
    public final ajgw d;
    public final PendingIntent e;
    public final String f;
    public final long g;
    public final long h;

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, ajgw ajgwVar, PendingIntent pendingIntent, String str, long j, long j2) {
        this.a = i;
        this.b = contextFenceRegistrationStub;
        this.c = null;
        this.d = ajgwVar;
        this.e = pendingIntent;
        this.f = str;
        this.g = j;
        this.h = j2;
    }

    public static final UpdateFenceOperation a(String str, long j, ContextFenceStub contextFenceStub, PendingIntent pendingIntent) {
        return new UpdateFenceOperation(2, new ContextFenceRegistrationStub(str, j, contextFenceStub), (ajgw) null, pendingIntent, (String) null, -1L, -1L);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.t(parcel, 3, this.b, i, false);
        avtt avttVar = this.c;
        atzr.D(parcel, 4, avttVar == null ? null : avttVar.asBinder());
        atzr.t(parcel, 5, this.e, i, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.q(parcel, 7, this.g);
        atzr.q(parcel, 8, this.h);
        atzr.c(parcel, a);
    }

    public UpdateFenceOperation(ContextFenceRegistrationStub contextFenceRegistrationStub, avtt avttVar) {
        this.a = 1;
        this.b = contextFenceRegistrationStub;
        this.c = avttVar;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = -1L;
        this.h = -1L;
    }

    public UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, IBinder iBinder, PendingIntent pendingIntent, String str, long j, long j2) {
        avtt avtrVar;
        this.a = i;
        this.b = contextFenceRegistrationStub;
        if (iBinder == null) {
            avtrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
            avtrVar = queryLocalInterface instanceof avtt ? (avtt) queryLocalInterface : new avtr(iBinder);
        }
        this.c = avtrVar;
        this.d = null;
        this.e = pendingIntent;
        this.f = str;
        this.g = j;
        this.h = j2;
    }
}
