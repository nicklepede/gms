package com.google.android.gms.core.settings;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.chimera.BoundService;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.asej;
import defpackage.asot;
import defpackage.bwpd;
import defpackage.bwpf;
import defpackage.bwph;
import defpackage.eike;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ejhf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class GoogleSettingsBoundService extends BoundService {
    public static final asot a = asot.b("GoogleSettingsBndSvc", asej.CORE);
    public static final List b = new ArrayList();
    private final IBinder c = new bwpf(this);

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class GoogleSettingsCollectionOperation extends anxy {
        @Override // defpackage.anxy, com.google.android.chimera.IntentOperation
        public final void onHandleIntent(Intent intent) {
            List list;
            if (!"com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction()) || h(intent, "GoogleSettingsBoundService")) {
                return;
            }
            Bundle extras = intent.getExtras();
            eike.e(extras);
            int i = eitj.d;
            eite eiteVar = new eite();
            List<Parcel> a = bwph.a(extras);
            if (a != null) {
                for (Parcel parcel : a) {
                    parcel.setDataPosition(0);
                    eiteVar.i((GoogleSettingsItem) GoogleSettingsItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            eitj g = eiteVar.g();
            List list2 = GoogleSettingsBoundService.b;
            synchronized (list2) {
                try {
                    if (list2.isEmpty()) {
                        ((ejhf) GoogleSettingsBoundService.a.j()).x("onGoogleSettingsCollected invoked without any pending clients.");
                    } else {
                        try {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((bwpd) it.next()).a(g);
                            }
                            list = GoogleSettingsBoundService.b;
                        } catch (RemoteException e) {
                            ((ejhf) ((ejhf) GoogleSettingsBoundService.a.j()).s(e)).x("RemoteException when attempting to return GoogleSettings items.");
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

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        return this.c;
    }
}
