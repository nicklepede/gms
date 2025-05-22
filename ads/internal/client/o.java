package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class o extends t {
    final /* synthetic */ Context a;
    final /* synthetic */ AdSizeParcel b;
    final /* synthetic */ String c;
    final /* synthetic */ s d;

    public o(s sVar, Context context, AdSizeParcel adSizeParcel, String str) {
        this.a = context;
        this.b = adSizeParcel;
        this.c = str;
        this.d = sVar;
    }

    @Override // com.google.android.gms.ads.internal.client.t
    public final /* synthetic */ Object a() {
        s.a(this.a, "search");
        return new am();
    }

    @Override // com.google.android.gms.ads.internal.client.t
    public final /* bridge */ /* synthetic */ Object b() {
        return this.d.a.b(this.a, this.b, this.c, null, 3);
    }

    @Override // com.google.android.gms.ads.internal.client.t
    public final /* bridge */ /* synthetic */ Object c(ay ayVar) {
        an alVar;
        ObjectWrapper objectWrapper = new ObjectWrapper(this.a);
        Parcel fE = ayVar.fE();
        qmr.g(fE, objectWrapper);
        qmr.e(fE, this.b);
        fE.writeString(this.c);
        fE.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel fF = ayVar.fF(10, fE);
        IBinder readStrongBinder = fF.readStrongBinder();
        if (readStrongBinder == null) {
            alVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            alVar = queryLocalInterface instanceof an ? (an) queryLocalInterface : new al(readStrongBinder);
        }
        fF.recycle();
        return alVar;
    }
}
