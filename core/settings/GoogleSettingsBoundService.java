package com.google.android.gms.core.settings;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.chimera.BoundService;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.auid;
import defpackage.ausn;
import defpackage.byxq;
import defpackage.byxs;
import defpackage.byxu;
import defpackage.ekxj;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.eluo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class GoogleSettingsBoundService extends BoundService {
    public static final ausn a = ausn.b("GoogleSettingsBndSvc", auid.CORE);
    public static final List b = new ArrayList();
    private final IBinder c = new byxs(this);

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class GoogleSettingsCollectionOperation extends apzq {
        @Override // defpackage.apzq, com.google.android.chimera.IntentOperation
        public final void onHandleIntent(Intent intent) {
            List list;
            if (!"com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction()) || h(intent, "GoogleSettingsBoundService")) {
                return;
            }
            Bundle extras = intent.getExtras();
            ekxj.e(extras);
            int i = elgo.d;
            elgj elgjVar = new elgj();
            List<Parcel> a = byxu.a(extras);
            if (a != null) {
                for (Parcel parcel : a) {
                    parcel.setDataPosition(0);
                    elgjVar.i((GoogleSettingsItem) GoogleSettingsItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            elgo g = elgjVar.g();
            List list2 = GoogleSettingsBoundService.b;
            synchronized (list2) {
                try {
                    if (list2.isEmpty()) {
                        ((eluo) GoogleSettingsBoundService.a.j()).x("onGoogleSettingsCollected invoked without any pending clients.");
                    } else {
                        try {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((byxq) it.next()).a(g);
                            }
                            list = GoogleSettingsBoundService.b;
                        } catch (RemoteException e) {
                            ((eluo) ((eluo) GoogleSettingsBoundService.a.j()).s(e)).x("RemoteException when attempting to return GoogleSettings items.");
                            list = GoogleSettingsBoundService.b;
                        }
                        list.clear();
                    }
                } catch (Throwable th) {
                    GoogleSettingsBoundService.b.clear();
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        return this.c;
    }
}
