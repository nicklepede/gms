package com.google.android.gms.backup.settings.notifications;

import android.app.Application;
import com.google.android.gms.chimera.modules.backup.settings.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.alsv;
import defpackage.cyvm;
import defpackage.cyvn;
import defpackage.cyxa;
import defpackage.cyyi;
import defpackage.fpss;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public abstract class Pommel_BackupNotificationsTask extends GmsTaskBoundService implements cyvn, cyyi {
    private volatile cyxa a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.cyvn
    public final Application e() {
        return fpss.c() ? cyvm.a(getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override // defpackage.cyyi
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cyxa g() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new cyxa(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.cyyh
    public final Object h() {
        return g().h();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ((alsv) h()).a((BackupNotificationsTask) this);
        }
        super.onCreate();
    }
}
