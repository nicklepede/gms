package com.google.android.gms.backup.cloudrestore.component;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.cloudrestore.migrate.service.ContactsBackupInfo;
import defpackage.ajnj;
import defpackage.ajoc;
import defpackage.ajog;
import defpackage.ajoj;
import defpackage.ajqe;
import defpackage.ajwt;
import defpackage.ajxs;
import defpackage.akdm;
import defpackage.aupv;
import defpackage.czsl;
import defpackage.eqex;
import defpackage.eqgc;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CloudRestoreChimeraService extends Service {
    public static final ajwt a = new ajwt("CloudRestoreChimeraService");
    public czsl b;
    public Set c;
    public ajqe d;
    private akdm e;
    private ajoc f;

    public static void a(ajoj ajojVar, ContactsBackupInfo contactsBackupInfo) {
        try {
            ajojVar.a(contactsBackupInfo);
        } catch (RemoteException e) {
            a.g("Exception happened when returning contacts backup information to bound Activity.", e, new Object[0]);
        }
    }

    public static void b(ajog ajogVar, boolean z) {
        c();
        try {
            ajogVar.a(z);
        } catch (RemoteException e) {
            a.g("Exception happened when returning contacts restore result to bound Activity.", e, new Object[0]);
        }
    }

    public static void c() {
        a.j("Trigger sync adapter to restore Google contacts.", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putBoolean("expedited", true);
        bundle.putBoolean("force", true);
        ContentResolver.requestSync(null, "com.android.contacts", bundle);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (intent != null && "com.google.android.gms.backup.CLOUD_RESTORE_SERVICE_ACTION".equals(intent.getAction())) {
            a.j("Acting as CloudRestoreChimeraService", new Object[0]);
            return this.f;
        }
        if (intent == null) {
            a.m("Attempted to bind to service with null intent.", new Object[0]);
            return null;
        }
        a.m("Attempted to bind to service with action " + intent.getAction() + " that does not match com.google.android.gms.backup.CLOUD_RESTORE_SERVICE_ACTION", new Object[0]);
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        ajwt ajwtVar = a;
        ajwtVar.j("onCreate", new Object[0]);
        super.onCreate();
        if (this.f == null) {
            this.f = new ajoc(this);
        }
        this.b = new czsl(this);
        if (this.c == null) {
            int i = ajxs.a;
            this.c = ajxs.a(this);
        }
        this.d = new ajqe();
        this.e = new akdm(new aupv(1, 10));
        ajwtVar.h("User selected cloud restore - switching to GMS transport.", new Object[0]);
        eqgc.t(this.e.d(this, 1, null), new ajnj(this.d), eqex.a);
    }
}
