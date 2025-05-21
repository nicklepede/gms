package com.google.android.gms.backup.cloudrestore.component;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.cloudrestore.migrate.service.ContactsBackupInfo;
import defpackage.ahmt;
import defpackage.ahnm;
import defpackage.ahnq;
import defpackage.ahnt;
import defpackage.ahpo;
import defpackage.ahwd;
import defpackage.ahxc;
import defpackage.aicw;
import defpackage.asmb;
import defpackage.cxip;
import defpackage.enre;
import defpackage.ensj;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CloudRestoreChimeraService extends Service {
    public static final ahwd a = new ahwd("CloudRestoreChimeraService");
    public cxip b;
    public Set c;
    public ahpo d;
    private aicw e;
    private ahnm f;

    public static void a(ahnt ahntVar, ContactsBackupInfo contactsBackupInfo) {
        try {
            ahntVar.a(contactsBackupInfo);
        } catch (RemoteException e) {
            a.g("Exception happened when returning contacts backup information to bound Activity.", e, new Object[0]);
        }
    }

    public static void b(ahnq ahnqVar, boolean z) {
        c();
        try {
            ahnqVar.a(z);
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
        ahwd ahwdVar = a;
        ahwdVar.j("onCreate", new Object[0]);
        super.onCreate();
        if (this.f == null) {
            this.f = new ahnm(this);
        }
        this.b = new cxip(this);
        if (this.c == null) {
            int i = ahxc.a;
            this.c = ahxc.a(this);
        }
        this.d = new ahpo();
        this.e = new aicw(new asmb(1, 10));
        ahwdVar.h("User selected cloud restore - switching to GMS transport.", new Object[0]);
        ensj.t(this.e.d(this, 1, null), new ahmt(this.d), enre.a);
    }
}
