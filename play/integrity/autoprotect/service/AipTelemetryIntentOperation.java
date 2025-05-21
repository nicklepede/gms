package com.google.android.gms.play.integrity.autoprotect.service;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.play.integrity.autoprotect.AppContextProvider;
import com.google.android.gms.play.integrity.autoprotect.service.AipTelemetryIntentOperation;
import defpackage.arfc;
import defpackage.asej;
import defpackage.asot;
import defpackage.bvgb;
import defpackage.cwjq;
import defpackage.froq;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AipTelemetryIntentOperation extends IntentOperation {
    public static final asot a = asot.b("AipTelemetryIntentOperation", asej.PLAY_INTEGRITY_AUTOPROTECT);
    public final cwjq b;

    public AipTelemetryIntentOperation() {
        AppContextProvider appContextProvider = AppContextProvider.c;
        this.b = new cwjq(appContextProvider == null ? arfc.a() : appContextProvider.a);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.play.integrity.autoprotect.LOG_TELEMETRY") && froq.a.a().a()) {
            final bvgb v = bvgb.v();
            Optional flatMap = Optional.ofNullable(intent.getExtras()).flatMap(new Function() { // from class: cwjo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo464andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    boolean z;
                    Bundle bundle = (Bundle) obj;
                    String string = bundle.getString("com.google.android.gms.play.integrity.autoprotect.PackageName");
                    int a2 = fzmk.a(bundle.getInt("com.google.android.gms.play.integrity.autoprotect.EventType"));
                    int i = bundle.getInt("com.google.android.gms.play.integrity.autoprotect.VersionCode");
                    byte[] byteArray = bundle.getByteArray("com.google.android.gms.play.integrity.autoprotect.Payload");
                    AipTelemetryIntentOperation aipTelemetryIntentOperation = AipTelemetryIntentOperation.this;
                    if (string == null || a2 == 0 || a2 == 1 || i == 0 || byteArray == null) {
                        return Optional.empty();
                    }
                    try {
                        z = new aqus(aipTelemetryIntentOperation.b.a, string, -1L).a().c();
                    } catch (PackageManager.NameNotFoundException e) {
                        ((ejhf) ((ejhf) ((ejhf) AipTelemetryIntentOperation.a.j()).s(e)).ah((char) 8849)).B("Failed to check source stamp for package. Package name: %s", string);
                        z = false;
                    }
                    fecj v2 = fzml.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fecp fecpVar = v2.b;
                    fzml fzmlVar = (fzml) fecpVar;
                    fzmlVar.c = 1;
                    fzmlVar.b = 1 | fzmlVar.b;
                    if (!fecpVar.L()) {
                        v2.U();
                    }
                    fecp fecpVar2 = v2.b;
                    fzml fzmlVar2 = (fzml) fecpVar2;
                    fzmlVar2.b |= 2;
                    fzmlVar2.d = string;
                    long j = i;
                    if (!fecpVar2.L()) {
                        v2.U();
                    }
                    fzml fzmlVar3 = (fzml) v2.b;
                    fzmlVar3.b |= 4;
                    fzmlVar3.e = j;
                    feay w = feay.w(byteArray);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fzml fzmlVar4 = (fzml) v2.b;
                    fedh fedhVar = fzmlVar4.f;
                    if (!fedhVar.c()) {
                        fzmlVar4.f = fecp.E(fedhVar);
                    }
                    fzmlVar4.f.add(w);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fzml fzmlVar5 = (fzml) v2.b;
                    fzmlVar5.b |= 8;
                    fzmlVar5.g = z;
                    return Optional.of((fzml) v2.Q());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Objects.requireNonNull(v);
            flatMap.ifPresent(new Consumer() { // from class: cwjp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj) {
                    bvgb.this.f((fzml) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
