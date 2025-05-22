package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import defpackage.atzr;
import defpackage.cmmf;
import defpackage.cmmh;
import defpackage.cmmi;
import defpackage.cmmk;
import defpackage.cmmq;
import defpackage.cmms;
import defpackage.cmnr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cmnr();
    final int a;
    public final cmmh b;
    public final Strategy c;
    public final cmmk d;
    public final MessageFilter e;
    public final PendingIntent f;

    @Deprecated
    public final int g;

    @Deprecated
    public final String h;

    @Deprecated
    public final String i;
    public final byte[] j;

    @Deprecated
    public final boolean k;
    public final cmms l;

    @Deprecated
    public final boolean m;

    @Deprecated
    public final ClientAppContext n;
    public final boolean o;
    public final int p;
    public final int q;

    public SubscribeRequest(int i, IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3, int i3, int i4) {
        cmmh cmmfVar;
        cmmk cmmiVar;
        this.a = i;
        cmms cmmsVar = null;
        if (iBinder == null) {
            cmmfVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            cmmfVar = queryLocalInterface instanceof cmmh ? (cmmh) queryLocalInterface : new cmmf(iBinder);
        }
        this.b = cmmfVar;
        this.c = strategy;
        if (iBinder2 == null) {
            cmmiVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cmmiVar = queryLocalInterface2 instanceof cmmk ? (cmmk) queryLocalInterface2 : new cmmi(iBinder2);
        }
        this.d = cmmiVar;
        this.e = messageFilter;
        this.f = pendingIntent;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = bArr;
        this.k = z;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            cmmsVar = queryLocalInterface3 instanceof cmms ? (cmms) queryLocalInterface3 : new cmmq(iBinder3);
        }
        this.l = cmmsVar;
        this.m = z2;
        this.n = ClientAppContext.b(clientAppContext, str2, str, z2);
        this.o = z3;
        this.p = i3;
        this.q = i4;
    }

    public final String toString() {
        String str;
        byte[] bArr = this.j;
        PendingIntent pendingIntent = this.f;
        MessageFilter messageFilter = this.e;
        cmmk cmmkVar = this.d;
        Strategy strategy = this.c;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(strategy);
        String valueOf3 = String.valueOf(cmmkVar);
        String valueOf4 = String.valueOf(messageFilter);
        String valueOf5 = String.valueOf(pendingIntent);
        if (bArr == null) {
            str = null;
        } else {
            str = "<" + bArr.length + " bytes>";
        }
        cmms cmmsVar = this.l;
        boolean z = this.m;
        ClientAppContext clientAppContext = this.n;
        boolean z2 = this.o;
        String str2 = this.h;
        String str3 = this.i;
        boolean z3 = this.k;
        int i = this.q;
        return "SubscribeRequest{messageListener=" + valueOf + ", strategy=" + valueOf2 + ", callback=" + valueOf3 + ", filter=" + valueOf4 + ", pendingIntent=" + valueOf5 + ", hint=" + str + ", subscribeCallback=" + String.valueOf(cmmsVar) + ", useRealClientApiKey=" + z + ", clientAppContext=" + String.valueOf(clientAppContext) + ", isDiscardPendingIntent=" + z2 + ", zeroPartyPackageName=" + str2 + ", realClientPackageName=" + str3 + ", isIgnoreNearbyPermission=" + z3 + ", callingContext=" + i + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        cmmh cmmhVar = this.b;
        atzr.D(parcel, 2, cmmhVar == null ? null : cmmhVar.asBinder());
        atzr.t(parcel, 3, this.c, i, false);
        cmmk cmmkVar = this.d;
        atzr.D(parcel, 4, cmmkVar == null ? null : cmmkVar.asBinder());
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.o(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.i(parcel, 10, this.j, false);
        atzr.e(parcel, 11, this.k);
        cmms cmmsVar = this.l;
        atzr.D(parcel, 12, cmmsVar != null ? cmmsVar.asBinder() : null);
        atzr.e(parcel, 13, this.m);
        atzr.t(parcel, 14, this.n, i, false);
        atzr.e(parcel, 15, this.o);
        atzr.o(parcel, 16, this.p);
        atzr.o(parcel, 17, this.q);
        atzr.c(parcel, a);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, IBinder iBinder3, boolean z, int i) {
        this(iBinder, strategy, iBinder2, messageFilter, pendingIntent, null, iBinder3, z, 0, i);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, null, null, bArr, false, iBinder3, false, null, z, i, i2);
    }
}
