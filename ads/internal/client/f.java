package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.azhu;
import defpackage.azhv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f extends azhv {
    private com.google.android.gms.ads.internal.report.f a;

    public f() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // defpackage.azhv
    protected final /* synthetic */ Object a(IBinder iBinder) {
        return ap.asInterface(iBinder);
    }

    public final an b(Context context, AdSizeParcel adSizeParcel, String str, com.google.android.gms.ads.internal.mediation.client.e eVar, int i) {
        com.google.android.gms.ads.internal.config.p.c(context);
        if (!((Boolean) com.google.android.gms.ads.internal.config.p.bt.g()).booleanValue()) {
            try {
                IBinder newAdManagerByType = ((aq) c(context)).newAdManagerByType(new ObjectWrapper(context), adSizeParcel, str, eVar, ModuleDescriptor.MODULE_VERSION, i);
                if (newAdManagerByType == null) {
                    return null;
                }
                IInterface queryLocalInterface = newAdManagerByType.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof an ? (an) queryLocalInterface : new al(newAdManagerByType);
            } catch (RemoteException | azhu e) {
                com.google.android.gms.ads.internal.util.client.h.e("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder newAdManagerByType2 = ((aq) com.google.android.gms.ads.internal.util.client.l.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.j() { // from class: com.google.android.gms.ads.internal.client.e
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.j
                public final Object a(Object obj) {
                    return ap.asInterface(obj);
                }
            })).newAdManagerByType(new ObjectWrapper(context), adSizeParcel, str, eVar, ModuleDescriptor.MODULE_VERSION, i);
            if (newAdManagerByType2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = newAdManagerByType2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof an ? (an) queryLocalInterface2 : new al(newAdManagerByType2);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.k | NullPointerException e2) {
            com.google.android.gms.ads.internal.report.f a = com.google.android.gms.ads.internal.report.d.a(context);
            this.a = a;
            a.e(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
