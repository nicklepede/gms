package com.google.android.gms.backup.transport.mms;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import defpackage.ajql;
import defpackage.ajua;
import defpackage.ajum;
import defpackage.ajuv;
import defpackage.ajvg;
import defpackage.ajvi;
import defpackage.ajvp;
import defpackage.ajwt;
import defpackage.akcc;
import defpackage.aker;
import defpackage.akeu;
import defpackage.akey;
import defpackage.akzj;
import defpackage.amjd;
import defpackage.amje;
import defpackage.apzg;
import defpackage.aupn;
import defpackage.aupz;
import defpackage.fodw;
import defpackage.foeb;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class MmsRestoreChimeraService extends aupn {
    public static final ajwt a = new ajwt("MmsRestoreService");
    public akeu b;
    public final Executor c = new aupz(1, 9);

    public final ajvi a() {
        return foeb.c() ? new ajum(this) : fodw.E() ? new ajuv(this) : new ajvg(this);
    }

    @Override // defpackage.aupn
    protected final void b(Intent intent) {
        if (this.b == null) {
            this.b = new akeu(this);
        }
        akcc akccVar = new akcc(this, getPackageManager());
        akey akeyVar = new akey(this);
        amje amjeVar = new amje(this, this.b, new ajql(this), a(), new ajvp(this), fodw.F() ? new ajua(this) : null, ModuleManager.get(this), akccVar, akeyVar);
        Notification.Builder progress = aker.a(this).setContentTitle(getResources().getString(R.string.mms_restore_foreground_notification_title)).setProgress(0, 0, true);
        progress.setSmallIcon(apzg.a(this, R.drawable.g1_notification_logo_24));
        startForeground(9901, progress.build());
        try {
            amjeVar.c();
        } catch (amjd e) {
            a.n("Error restoring MMS", e, new Object[0]);
        }
    }

    @Override // defpackage.aupn, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (fodw.Q()) {
            return new akzj(this);
        }
        return null;
    }
}
