package com.google.android.gms.play.integrity.api.service;

import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.play.integrity.api.service.IntegrityApiPersistentChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.caqj;
import defpackage.cysy;
import defpackage.cytk;
import defpackage.flml;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class IntegrityApiPersistentChimeraService extends cytk {
    public flml a;
    public DisplayManager b;
    private Optional c = Optional.empty();

    static {
        ausn.b("IntegrityApiPersistentService", auid.PLAY_INTEGRITY_API);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (this.c.isPresent()) {
            this.b.unregisterDisplayListener((DisplayManager.DisplayListener) this.a.a());
            this.c = Optional.empty();
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.hardware.display.DisplayManager$DisplayListener, java.lang.Object] */
    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.c.isPresent();
        if (((Boolean) this.c.map(new Function() { // from class: cyth
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cysy) obj) == IntegrityApiPersistentChimeraService.this.a.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            return 1;
        }
        this.b.registerDisplayListener((DisplayManager.DisplayListener) this.a.a(), new caqj(Looper.getMainLooper()));
        if (this.c.isPresent()) {
            this.b.unregisterDisplayListener(this.c.get());
        }
        this.c = Optional.of((cysy) this.a.a());
        return 1;
    }
}
