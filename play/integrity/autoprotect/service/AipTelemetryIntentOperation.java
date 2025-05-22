package com.google.android.gms.play.integrity.autoprotect.service;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.play.integrity.autoprotect.AppContextProvider;
import com.google.android.gms.play.integrity.autoprotect.service.AipTelemetryIntentOperation;
import defpackage.athr;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bxod;
import defpackage.cytn;
import defpackage.fuiu;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class AipTelemetryIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("AipTelemetryIntentOperation", auid.PLAY_INTEGRITY_AUTOPROTECT);
    public final cytn b;

    public AipTelemetryIntentOperation() {
        AppContextProvider appContextProvider = AppContextProvider.c;
        this.b = new cytn(appContextProvider == null ? athr.a() : appContextProvider.a);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.play.integrity.autoprotect.LOG_TELEMETRY") && fuiu.a.lK().a()) {
            final bxod v = bxod.v();
            Optional flatMap = Optional.ofNullable(intent.getExtras()).flatMap(new Function() { // from class: cytl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo479andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    boolean z;
                    Bundle bundle = (Bundle) obj;
                    String string = bundle.getString("com.google.android.gms.play.integrity.autoprotect.PackageName");
                    int a2 = gcje.a(bundle.getInt("com.google.android.gms.play.integrity.autoprotect.EventType"));
                    int i = bundle.getInt("com.google.android.gms.play.integrity.autoprotect.VersionCode");
                    byte[] byteArray = bundle.getByteArray("com.google.android.gms.play.integrity.autoprotect.Payload");
                    AipTelemetryIntentOperation aipTelemetryIntentOperation = AipTelemetryIntentOperation.this;
                    if (string == null || a2 == 0 || a2 == 1 || i == 0 || byteArray == null) {
                        return Optional.empty();
                    }
                    try {
                        z = new asxh(aipTelemetryIntentOperation.b.a, string, -1L).a().c();
                    } catch (PackageManager.NameNotFoundException e) {
                        ((eluo) ((eluo) ((eluo) AipTelemetryIntentOperation.a.j()).s(e)).ai((char) 8847)).B("Failed to check source stamp for package. Package name: %s", string);
                        z = false;
                    }
                    fgrc v2 = gcjf.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fgri fgriVar = v2.b;
                    gcjf gcjfVar = (gcjf) fgriVar;
                    gcjfVar.c = 1;
                    gcjfVar.b = 1 | gcjfVar.b;
                    if (!fgriVar.L()) {
                        v2.U();
                    }
                    fgri fgriVar2 = v2.b;
                    gcjf gcjfVar2 = (gcjf) fgriVar2;
                    gcjfVar2.b |= 2;
                    gcjfVar2.d = string;
                    long j = i;
                    if (!fgriVar2.L()) {
                        v2.U();
                    }
                    gcjf gcjfVar3 = (gcjf) v2.b;
                    gcjfVar3.b |= 4;
                    gcjfVar3.e = j;
                    fgpr w = fgpr.w(byteArray);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    gcjf gcjfVar4 = (gcjf) v2.b;
                    fgsa fgsaVar = gcjfVar4.f;
                    if (!fgsaVar.c()) {
                        gcjfVar4.f = fgri.E(fgsaVar);
                    }
                    gcjfVar4.f.add(w);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    gcjf gcjfVar5 = (gcjf) v2.b;
                    gcjfVar5.b |= 8;
                    gcjfVar5.g = z;
                    return Optional.of((gcjf) v2.Q());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Objects.requireNonNull(v);
            flatMap.ifPresent(new Consumer() { // from class: cytm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void u(Object obj) {
                    bxod.this.f((gcjf) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
