package com.google.android.gms.play.integrity.api.service;

import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.play.integrity.api.service.IntegrityApiPersistentChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byhr;
import defpackage.cwjb;
import defpackage.cwjn;
import defpackage.fiwo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class IntegrityApiPersistentChimeraService extends cwjn {
    public fiwo a;
    public DisplayManager b;
    private Optional c = Optional.empty();

    static {
        asot.b("IntegrityApiPersistentService", asej.PLAY_INTEGRITY_API);
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
        if (((Boolean) this.c.map(new Function() { // from class: cwjk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cwjb) obj) == IntegrityApiPersistentChimeraService.this.a.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            return 1;
        }
        this.b.registerDisplayListener((DisplayManager.DisplayListener) this.a.a(), new byhr(Looper.getMainLooper()));
        if (this.c.isPresent()) {
            this.b.unregisterDisplayListener(this.c.get());
        }
        this.c = Optional.of((cwjb) this.a.a());
        return 1;
    }
}
