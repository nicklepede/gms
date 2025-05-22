package com.google.android.gms.notifications.registration.service;

import android.app.Application;
import com.google.android.gms.chimera.modules.notifications.registration.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.cuna;
import defpackage.cyvm;
import defpackage.cyvn;
import defpackage.cyxa;
import defpackage.cyyi;
import defpackage.fpss;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class Pommel_NotificationsRegistrationTaskBoundService extends GmsTaskBoundService implements cyvn, cyyi {
    private volatile cyxa a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.cyyi
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.cyvn
    public final Application e() {
        return fpss.c() ? cyvm.a(getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override // defpackage.cyyh
    public final Object h() {
        return g().h();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ((cuna) h()).b((NotificationsRegistrationTaskBoundService) this);
        }
        super.onCreate();
    }
}
