package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        Parcel fr = ayVar.fr();
        oto.g(fr, objectWrapper);
        oto.e(fr, this.b);
        fr.writeString(this.c);
        fr.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel fs = ayVar.fs(10, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        if (readStrongBinder == null) {
            alVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            alVar = queryLocalInterface instanceof an ? (an) queryLocalInterface : new al(readStrongBinder);
        }
        fs.recycle();
        return alVar;
    }
}
