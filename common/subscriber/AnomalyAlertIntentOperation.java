package com.google.android.gms.common.subscriber;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aryj;
import defpackage.aryk;
import defpackage.aryl;
import defpackage.arym;
import defpackage.aryn;
import defpackage.aryp;
import defpackage.asej;
import defpackage.askx;
import defpackage.asky;
import defpackage.asmf;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bry;
import defpackage.ejhf;
import defpackage.ensa;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fmse;
import j$.time.Duration;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AnomalyAlertIntentOperation extends IntentOperation {
    private static final asot b = asot.b("AnomalyAlertLogger", asej.CORE);
    public final asky a;

    public AnomalyAlertIntentOperation() {
        this.a = new asky();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        enss i;
        if (asqh.e()) {
            ((ejhf) ((ejhf) b.h()).ah((char) 3265)).B("Received alert intent: %s", intent.getAction());
            asot asotVar = aryk.a;
            aryk arykVar = aryj.a;
            if (fmse.e()) {
                arym arymVar = arym.TRACE;
                if (arykVar.a(arymVar)) {
                    intent.getAction();
                    long longExtra = intent.getLongExtra("android.app.extra.STATS_SUBSCRIPTION_RULE_ID", -1L);
                    List asList = Arrays.asList(arymVar);
                    if (asList == null || asList.isEmpty()) {
                        i = ensj.i(aryn.a());
                    } else {
                        bry bryVar = arykVar.b;
                        synchronized (bryVar) {
                            if (bryVar.isEmpty()) {
                                i = ensj.i(aryn.a());
                            } else {
                                bry bryVar2 = new bry(bryVar);
                                ArrayList arrayList = new ArrayList();
                                final aryl arylVar = new aryl();
                                for (final aryp arypVar : bryVar2.values()) {
                                    arym arymVar2 = arym.TRACE;
                                    if (asList.contains(arymVar2) && arypVar.a) {
                                        if (arymVar2.ordinal() != 1) {
                                            ((ejhf) ((ejhf) aryk.a.j()).ah((char) 3200)).B("Metric type %s not supported", arymVar2);
                                        } else {
                                            arrayList.add(arykVar.c.submit(new Callable() { // from class: aryh
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    asot asotVar2 = aryk.a;
                                                    aryp arypVar2 = aryp.this;
                                                    aryl arylVar2 = arylVar;
                                                    try {
                                                        Runtime.getRuntime().gc();
                                                        try {
                                                            enoo.a(Duration.ofMillis(fmyf.a.a().a()));
                                                        } catch (InterruptedException unused) {
                                                            Thread.currentThread().interrupt();
                                                        }
                                                        eitj a = arypVar2.b.a();
                                                        if (a == null) {
                                                            return null;
                                                        }
                                                        arylVar2.a = a;
                                                        return null;
                                                    } catch (ClassCastException e) {
                                                        ((ejhf) ((ejhf) ((ejhf) aryk.a.j()).s(e)).ah((char) 3199)).x("Failed to retrieve trace data");
                                                        return null;
                                                    }
                                                }
                                            }));
                                        }
                                    }
                                }
                                ensa a = ensj.a(arrayList);
                                Objects.requireNonNull(arylVar);
                                i = a.a(new Callable() { // from class: aryi
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return new aryn(aryl.this.a);
                                    }
                                }, arykVar.c);
                            }
                        }
                    }
                    ((ejhf) ((ejhf) b.h()).ah((char) 3269)).x("Add callback to upload trace.");
                    ensj.t(i, new askx(this, longExtra), new asmf(1, 10));
                }
            }
        }
    }

    public AnomalyAlertIntentOperation(asky askyVar) {
        this.a = askyVar;
    }
}
