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
import defpackage.arxc;
import defpackage.ckea;
import defpackage.ckec;
import defpackage.cked;
import defpackage.ckef;
import defpackage.ckel;
import defpackage.cken;
import defpackage.ckfm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ckfm();
    final int a;
    public final ckec b;
    public final Strategy c;
    public final ckef d;
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
    public final cken l;

    @Deprecated
    public final boolean m;

    @Deprecated
    public final ClientAppContext n;
    public final boolean o;
    public final int p;
    public final int q;

    public SubscribeRequest(int i, IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3, int i3, int i4) {
        ckec ckeaVar;
        ckef ckedVar;
        this.a = i;
        cken ckenVar = null;
        if (iBinder == null) {
            ckeaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            ckeaVar = queryLocalInterface instanceof ckec ? (ckec) queryLocalInterface : new ckea(iBinder);
        }
        this.b = ckeaVar;
        this.c = strategy;
        if (iBinder2 == null) {
            ckedVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ckedVar = queryLocalInterface2 instanceof ckef ? (ckef) queryLocalInterface2 : new cked(iBinder2);
        }
        this.d = ckedVar;
        this.e = messageFilter;
        this.f = pendingIntent;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = bArr;
        this.k = z;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            ckenVar = queryLocalInterface3 instanceof cken ? (cken) queryLocalInterface3 : new ckel(iBinder3);
        }
        this.l = ckenVar;
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
        ckef ckefVar = this.d;
        Strategy strategy = this.c;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(strategy);
        String valueOf3 = String.valueOf(ckefVar);
        String valueOf4 = String.valueOf(messageFilter);
        String valueOf5 = String.valueOf(pendingIntent);
        if (bArr == null) {
            str = null;
        } else {
            str = "<" + bArr.length + " bytes>";
        }
        cken ckenVar = this.l;
        boolean z = this.m;
        ClientAppContext clientAppContext = this.n;
        boolean z2 = this.o;
        String str2 = this.h;
        String str3 = this.i;
        boolean z3 = this.k;
        int i = this.q;
        return "SubscribeRequest{messageListener=" + valueOf + ", strategy=" + valueOf2 + ", callback=" + valueOf3 + ", filter=" + valueOf4 + ", pendingIntent=" + valueOf5 + ", hint=" + str + ", subscribeCallback=" + String.valueOf(ckenVar) + ", useRealClientApiKey=" + z + ", clientAppContext=" + String.valueOf(clientAppContext) + ", isDiscardPendingIntent=" + z2 + ", zeroPartyPackageName=" + str2 + ", realClientPackageName=" + str3 + ", isIgnoreNearbyPermission=" + z3 + ", callingContext=" + i + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        ckec ckecVar = this.b;
        arxc.D(parcel, 2, ckecVar == null ? null : ckecVar.asBinder());
        arxc.t(parcel, 3, this.c, i, false);
        ckef ckefVar = this.d;
        arxc.D(parcel, 4, ckefVar == null ? null : ckefVar.asBinder());
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.o(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.i(parcel, 10, this.j, false);
        arxc.e(parcel, 11, this.k);
        cken ckenVar = this.l;
        arxc.D(parcel, 12, ckenVar != null ? ckenVar.asBinder() : null);
        arxc.e(parcel, 13, this.m);
        arxc.t(parcel, 14, this.n, i, false);
        arxc.e(parcel, 15, this.o);
        arxc.o(parcel, 16, this.p);
        arxc.o(parcel, 17, this.q);
        arxc.c(parcel, a);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, IBinder iBinder3, boolean z, int i) {
        this(iBinder, strategy, iBinder2, messageFilter, pendingIntent, null, iBinder3, z, 0, i);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, null, null, bArr, false, iBinder3, false, null, z, i, i2);
    }
}
