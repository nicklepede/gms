package com.google.android.gms.constellation;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import defpackage.atpx;
import defpackage.auad;
import defpackage.auio;
import defpackage.auub;
import defpackage.avah;
import defpackage.avas;
import defpackage.avbz;
import defpackage.avcg;
import defpackage.avcp;
import defpackage.avcw;
import defpackage.avdl;
import defpackage.avdr;
import defpackage.avdu;
import defpackage.avdx;
import defpackage.avdz;
import defpackage.avoy;
import defpackage.avpa;
import defpackage.avph;
import defpackage.avpn;
import defpackage.avpz;
import defpackage.avqa;
import defpackage.avqb;
import defpackage.avqe;
import defpackage.avqf;
import defpackage.avqh;
import defpackage.avqi;
import defpackage.avqj;
import defpackage.avqm;
import defpackage.avqn;
import defpackage.avqu;
import defpackage.avre;
import defpackage.avrh;
import defpackage.bqgd;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekww;
import defpackage.elgo;
import defpackage.eqju;
import defpackage.eqjw;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgtj;
import defpackage.fgub;
import defpackage.fgvn;
import defpackage.fmcm;
import defpackage.fmcp;
import defpackage.fmcr;
import defpackage.fmcs;
import defpackage.fmct;
import defpackage.fmdd;
import defpackage.fmer;
import defpackage.fmet;
import defpackage.fmfa;
import defpackage.fmfc;
import defpackage.fmfh;
import defpackage.fmfi;
import defpackage.fmfn;
import defpackage.fmft;
import defpackage.fmga;
import defpackage.fmgb;
import defpackage.fmgc;
import defpackage.fmgd;
import defpackage.fmge;
import defpackage.fmgf;
import defpackage.fmgi;
import defpackage.fmgj;
import defpackage.fmgp;
import defpackage.fmgq;
import defpackage.fmgr;
import defpackage.fmgs;
import defpackage.fmgt;
import defpackage.fmgu;
import defpackage.fmgv;
import defpackage.fmhe;
import defpackage.fmhg;
import defpackage.fmhj;
import defpackage.fpbt;
import defpackage.fpcw;
import defpackage.fpea;
import defpackage.fpeg;
import defpackage.fpeq;
import defpackage.wfy;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class EventManager extends IntentOperation {
    private static final auad a = avqj.a("event_manager");
    private boolean b = false;
    private Exception c;
    private avdx d;

    private final String a() {
        try {
            String c = bqgd.g(getApplicationContext()).c(fpea.d(), "GCM");
            SharedPreferences.Editor edit = ((avdz) this.d).c.edit();
            edit.putString("gcm_token", c);
            edit.apply();
            return c;
        } catch (IOException e) {
            a.g("Couldn't get GCM token", e, new Object[0]);
            this.c = e;
            this.b = true;
            return null;
        }
    }

    private final String b(Intent intent, avqf avqfVar) {
        String str;
        String a2;
        String action = intent.getAction();
        boolean booleanExtra = intent.getBooleanExtra("eventmanager.force_refresh", false);
        try {
            str = intent.getStringExtra("iid_token");
        } catch (BadParcelableException e) {
            a.g("BadparcelableException for iid token key: ", e, new Object[0]);
            str = null;
        }
        if (intent.getBooleanExtra("eventmanager.generate_iid_token", false) || g(action)) {
            if (TextUtils.isEmpty(str)) {
                if (booleanExtra) {
                    a2 = a();
                } else {
                    a2 = a();
                    if (TextUtils.isEmpty(a2)) {
                        a2 = ((avdz) this.d).c.getString("gcm_token", null);
                    }
                }
                str = a2;
            }
            avqfVar.g = str;
        }
        return str;
    }

    private final ArrayList c(Intent intent, avqf avqfVar) {
        String action = intent.getAction();
        boolean booleanExtra = intent.getBooleanExtra("eventmanager.generate_gaia_tokens", false);
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            arrayList = intent.getStringArrayListExtra("gaia_tokens");
        } catch (BadParcelableException e) {
            a.g("BadparcelableException for gaia tokens key: ", e, new Object[0]);
        }
        if (booleanExtra || g(action)) {
            if (arrayList == null || arrayList.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>();
                avph.d();
                arrayList2.addAll(avph.b(avqfVar, fpea.c(), getBaseContext(), new Bundle()).values());
                arrayList = arrayList2;
            }
            avqfVar.h = arrayList;
        }
        return arrayList;
    }

    private final void d(avqe avqeVar, avqf avqfVar) {
        if (avqeVar.b) {
            avah b = avah.b();
            Context applicationContext = getApplicationContext();
            if (fpeg.a.lK().v()) {
                Pair g = avdl.b().a(applicationContext).g();
                if (((Long) g.first).longValue() == -1) {
                    elgo elgoVar = b.b;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!elgoVar.isEmpty()) {
                        long longValue = ((Long) elgoVar.get(0)).longValue() + currentTimeMillis;
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        avdx a2 = avdl.b().a(applicationContext2);
                        atpx atpxVar = ((avdz) a2).c;
                        long j = atpxVar.getLong("sync_retry_scheduling_frozen_timestamp_in_millis", 0L);
                        if (j > System.currentTimeMillis()) {
                            avah.a.d("Sync re-try is frozen util %s", avpn.d(j));
                        } else {
                            a2.l();
                            long min = Math.min(longValue, avah.a(applicationContext, currentTimeMillis, null));
                            RefreshGcmTaskChimeraService.e(applicationContext2, min, true);
                            long currentTimeMillis2 = System.currentTimeMillis() + b.c;
                            SharedPreferences.Editor edit = atpxVar.edit();
                            edit.putLong("sync_retry_scheduling_frozen_timestamp_in_millis", currentTimeMillis2);
                            edit.apply();
                            a2.w(min, 1);
                        }
                    }
                } else {
                    Context applicationContext3 = applicationContext.getApplicationContext();
                    avdx a3 = avdl.b().a(applicationContext3);
                    int intValue = ((Integer) g.second).intValue();
                    if (((Long) g.first).longValue() == -1) {
                        avah.a.d("Cannot schedule the next re-try time: current one is non-existing", new Object[0]);
                        a3.m();
                    } else {
                        elgo elgoVar2 = b.b;
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (intValue >= elgoVar2.size()) {
                            avah.a.d("Cannot schedule the next re-try time: reach the end of the scheduling.", new Object[0]);
                            a3.m();
                            a3.l();
                            avah.d(applicationContext);
                        } else {
                            long longValue2 = currentTimeMillis3 + ((Long) elgoVar2.get(intValue)).longValue();
                            RefreshGcmTaskChimeraService.e(applicationContext3, longValue2, true);
                            a3.w(longValue2, intValue + 1);
                        }
                    }
                }
            } else {
                avah.a.d("Retry sync is disabled", new Object[0]);
            }
        }
        f();
        avqfVar.a();
    }

    private final void e(avqf avqfVar) {
        Context applicationContext = getApplicationContext();
        avah.b();
        avdx a2 = avdl.b().a(applicationContext.getApplicationContext());
        a2.l();
        a2.m();
        avah.b();
        avah.c(applicationContext, avqfVar);
        f();
        avqfVar.a();
    }

    private final void f() {
        if (fpbt.i()) {
            if (!this.d.y()) {
                return;
            }
        } else if (!this.d.z()) {
            return;
        }
        if (fpcw.i()) {
            avcg.a().b();
            RefreshGcmTaskChimeraService.d(getApplicationContext());
        }
        if (fpcw.j()) {
            avcp.i(getApplicationContext()).e();
            RefreshGcmTaskChimeraService.f(getApplicationContext());
        }
    }

    private static final boolean g(String str) {
        return Objects.equals(str, "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION_IF_STATE_MISMATCH") || Objects.equals(str, "com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION") || Objects.equals(str, "com.google.android.gms.constellation.eventmanager.GET_ASTERISM_CONSENT") || Objects.equals(str, "com.google.android.gms.constellation.eventmanager.SET_ASTERISM_CONSENT");
    }

    private static final void h(ResultReceiver resultReceiver, int i, Bundle bundle) {
        if (resultReceiver != null) {
            resultReceiver.send(i, bundle);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [avas] */
    /* JADX WARN: Type inference failed for: r8v14, types: [avas] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String str;
        ResultReceiver resultReceiver;
        avqf avqfVar;
        avas avasVar;
        Throwable th;
        int intExtra;
        char c;
        Bundle bundle;
        ResultReceiver resultReceiver2;
        Bundle bundle2;
        ResultReceiver resultReceiver3;
        String str2;
        avqf avqfVar2;
        ArrayList arrayList;
        fmhg fmhgVar;
        ArrayList arrayList2;
        Map map;
        avrh avreVar;
        int slotIndex;
        HashMap g;
        String str3;
        int i;
        int b;
        fmgp fmgpVar;
        avas avasVar2;
        boolean p;
        avas avasVar3;
        EventManager eventManager = this;
        String action = intent.getAction();
        try {
            eventManager.d = avdl.b().a(eventManager.getBaseContext());
            str = intent.getStringExtra("eventmanager.session_id");
        } catch (BadParcelableException e) {
            a.g("BadparcelableException for UUID: ", e, new Object[0]);
            str = null;
        }
        try {
            resultReceiver = (ResultReceiver) intent.getParcelableExtra("eventmanager.on_sync_complete_callback_key");
        } catch (BadParcelableException e2) {
            a.g("BadparcelableException for resultReceiver: ", e2, new Object[0]);
            resultReceiver = null;
        }
        avpz a2 = avpz.a(eventManager);
        if (TextUtils.isEmpty(str)) {
            avqf avqfVar3 = new avqf(UUID.randomUUID().toString());
            a2.o(avqfVar3, eqjw.NULL_SESSION_ID);
            avqfVar = avqfVar3;
        } else {
            avqfVar = new avqf(str);
        }
        a2.o(avqfVar, eqjw.EVENT_MANAGER_HANDLE_INTENT);
        if (resultReceiver == null) {
            a2.o(avqfVar, eqjw.NULL_RESULT_RECEIVER);
        }
        ?? r8 = "eventmanager.calling_package_key";
        if (Objects.equals(action, "com.google.android.gms.constellation.eventmanager.CACHE_EXTERNAL_CONSENT_ACTIVITY_STATE")) {
            eqjw b2 = eqjw.b(intent.getIntExtra("eventmanager.external_consent_activity_state", eqjw.TOS_CONSENT_EVENT_CANCELED.a()));
            String stringExtra = intent.getStringExtra("eventmanager.calling_package_key");
            try {
                avdl.b();
                avdl.c(eventManager.getApplicationContext(), 2).e((avdr) avdu.a.getOrDefault(b2, avdr.FAILED), stringExtra);
                return;
            } catch (avqa e3) {
                a.g("Could not prepare state cache", e3, new Object[0]);
                a2.g(avqfVar, eqjw.TOS_CONSENT_STATE, eqju.TOS_STATE_DB_UNAVAILABLE_FOR_WRITE, e3.getMessage());
                return;
            } catch (avqe e4) {
                a.g("Could not write state in cache", e4, new Object[0]);
                a2.g(avqfVar, eqjw.TOS_CONSENT_STATE, eqju.TOS_STATE_WRITE_FAILED, e4.getMessage());
                return;
            }
        }
        if (Objects.equals(action, "com.google.android.gms.constellation.eventmanager.GENERATE_TOKENS") || g(action)) {
            String b3 = eventManager.b(intent, avqfVar);
            ArrayList<String> c2 = eventManager.c(intent, avqfVar);
            if (!g(action)) {
                ResultReceiver resultReceiver4 = resultReceiver;
                Bundle bundle3 = new Bundle();
                if (!c2.isEmpty()) {
                    bundle3.putStringArrayList("gaia_tokens", c2);
                }
                if (!TextUtils.isEmpty(b3)) {
                    bundle3.putString("iid_token", b3);
                }
                h(resultReceiver4, 3, bundle3);
                return;
            }
            avpz a3 = avpz.a(eventManager.getBaseContext());
            if (TextUtils.isEmpty(avqfVar.g)) {
                if (eventManager.b) {
                    a3.e(avqfVar, eqjw.IID_TOKEN_GENERATION_FAILED, eventManager.c);
                }
                a.m("Event manager is not initialized", new Object[0]);
                eqju eqjuVar = eqju.EVENT_MANAGER_NOT_INITIALIZED;
                avpa.a(eventManager.getBaseContext().getApplicationContext());
                avqe avqeVar = new avqe(eqjuVar, !avpa.b(eventManager.getBaseContext()));
                eventManager.d(avqeVar, avqfVar);
                Bundle bundle4 = new Bundle();
                bundle4.putSerializable("failure_verification_exception_key", avqeVar);
                h(resultReceiver, 0, bundle4);
                return;
            }
            avas avasVar4 = new avas(eventManager.getApplicationContext());
            try {
                intExtra = intent.getIntExtra("eventmanager.trigger_type", 0);
                avqfVar.c = intExtra;
                try {
                    a.h("Starting session. sessionId: %s from trigger: %s", avqfVar.a, Integer.valueOf(intExtra));
                    switch (action.hashCode()) {
                        case -1228157273:
                            if (action.equals("com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 140032422:
                            if (action.equals("com.google.android.gms.constellation.eventmanager.SYNC_VERIFICATION_IF_STATE_MISMATCH")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 996529700:
                            if (action.equals("com.google.android.gms.constellation.eventmanager.SET_ASTERISM_CONSENT")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1607453104:
                            if (action.equals("com.google.android.gms.constellation.eventmanager.GET_ASTERISM_CONSENT")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    avasVar = avasVar4;
                }
            } catch (Throwable th3) {
                th = th3;
                avasVar = avasVar4;
            }
            if (c != 0) {
                try {
                    if (c != 1) {
                        if (c == 2) {
                            r8 = avasVar4;
                            Bundle bundle5 = new Bundle();
                            try {
                                Bundle bundleExtra = intent.getBundleExtra("eventmanager.extra_param");
                                fmcm b4 = fmcm.b(intent.getIntExtra("eventmanager.aster_client", fmcm.UNKNOWN_CLIENT.a()));
                                if (fpbt.g()) {
                                    avbz avbzVar = r8.d;
                                    List j = avas.j(bundleExtra);
                                    fmfi c3 = avbzVar.c(avqfVar, b4);
                                    if (!j.isEmpty()) {
                                        c3.a(j);
                                    }
                                    wfy a4 = avbzVar.a(avqfVar, c3, b4);
                                    bundle5.putSerializable("success_consent_version_key", Integer.valueOf(fmet.a(a4.b)));
                                    p = GetAsterismConsentResponse.a(a4.a);
                                } else {
                                    p = r8.d.p(avqfVar, avas.j(bundleExtra), b4);
                                }
                                bundle5.putSerializable("success_consent_value_key", Boolean.valueOf(p));
                                h(resultReceiver, 4, bundle5);
                                avasVar2 = r8;
                            } catch (avqe e5) {
                                bundle5.putSerializable("failure_verification_exception_key", e5);
                                h(resultReceiver, 0, bundle5);
                                avasVar2 = r8;
                            }
                        } else if (c != 3) {
                            try {
                                a3.o(avqfVar, eqjw.EVENT_MANAGER_INVALID_ACTION);
                                avasVar = avasVar4;
                            } catch (Throwable th4) {
                                th = th4;
                                avasVar = avasVar4;
                            }
                        } else {
                            try {
                                Bundle bundle6 = new Bundle();
                                try {
                                    Bundle bundleExtra2 = intent.getBundleExtra("eventmanager.extra_param");
                                    boolean booleanExtra = intent.getBooleanExtra("eventmanager.consent_value", false);
                                    fmcm b5 = fmcm.b(intent.getIntExtra("eventmanager.aster_client", fmcm.UNKNOWN_CLIENT.a()));
                                    byte[] byteArrayExtra = intent.getByteArrayExtra("eventmanager.audit_token");
                                    String stringExtra2 = intent.getStringExtra("eventmanager.consent_variant");
                                    int b6 = fmfc.b(intent.getIntExtra("eventmanager.device_verification_consent_version", fmfc.a(2)));
                                    int b7 = fmgi.b(intent.getIntExtra("eventmanager.device_verification_consent_source", fmgi.a(2)));
                                    if (stringExtra2 != null) {
                                        avasVar = avasVar4;
                                        try {
                                            avasVar.p(avqfVar, bundleExtra2, booleanExtra, intent.getStringExtra("eventmanager.gaia_access_token"), stringExtra2, intent.getStringExtra("eventmanager.consent_trigger"), b5, byteArrayExtra);
                                            avasVar3 = avasVar;
                                        } catch (avqe e6) {
                                            e = e6;
                                            avasVar3 = avasVar;
                                            bundle6.putSerializable("failure_verification_exception_key", e);
                                            h(resultReceiver, 0, bundle6);
                                            avasVar2 = avasVar3;
                                            avasVar = avasVar2;
                                            avasVar.close();
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                            avasVar.close();
                                            throw th;
                                        }
                                    } else {
                                        avasVar3 = avasVar4;
                                        try {
                                            if (SetAsterismConsentRequest.a(b5.a(), fmfc.a(b6), fmgi.a(b7))) {
                                                avbz avbzVar2 = avasVar3.d;
                                                fgrc u = avbzVar2.u(avqfVar, b5, byteArrayExtra, avas.j(bundleExtra2));
                                                fgrc v = fmfa.a.v();
                                                fmer fmerVar = booleanExtra ? fmer.CONSENTED : fmer.NO_CONSENT;
                                                if (!v.b.L()) {
                                                    v.U();
                                                }
                                                ((fmfa) v.b).b = fmerVar.a();
                                                if (!v.b.L()) {
                                                    v.U();
                                                }
                                                ((fmfa) v.b).d = fmfc.a(b6);
                                                if (!v.b.L()) {
                                                    v.U();
                                                }
                                                ((fmfa) v.b).c = fmgi.a(b7);
                                                if (!u.b.L()) {
                                                    u.U();
                                                }
                                                fmgf fmgfVar = (fmgf) u.b;
                                                fmfa fmfaVar = (fmfa) v.Q();
                                                fmgf fmgfVar2 = fmgf.a;
                                                fmfaVar.getClass();
                                                fmgfVar.d = fmfaVar;
                                                fmgfVar.c = 10;
                                                avbzVar2.o(avqfVar, booleanExtra, true, (fmgf) u.Q());
                                                avasVar3 = avasVar3;
                                            } else {
                                                avasVar3.d.t(avqfVar, booleanExtra, true, b5, byteArrayExtra, avas.j(bundleExtra2), fmet.b(intent.getIntExtra("eventmanager.consent_version", fmet.a(2))));
                                                avasVar3 = avasVar3;
                                            }
                                        } catch (avqe e7) {
                                            e = e7;
                                            bundle6.putSerializable("failure_verification_exception_key", e);
                                            h(resultReceiver, 0, bundle6);
                                            avasVar2 = avasVar3;
                                            avasVar = avasVar2;
                                            avasVar.close();
                                        }
                                    }
                                    h(resultReceiver, 5, Bundle.EMPTY);
                                    avasVar2 = avasVar3;
                                } catch (avqe e8) {
                                    e = e8;
                                    avasVar3 = avasVar4;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                r8 = avasVar4;
                            }
                        }
                        avasVar = avasVar2;
                    } else {
                        r8 = avasVar4;
                        try {
                            if (r8.q(avqfVar)) {
                                h(resultReceiver, 1, null);
                                eventManager.getApplicationContext();
                                ekww ekwwVar = bsxv.a;
                                bsxr.a(auio.CONSTELLATION_BACKGROUND_SYNC_VERIFICATION_IF_STATE_MISMATCH);
                            } else {
                                h(resultReceiver, 2, null);
                            }
                            eventManager.e(avqfVar);
                            avasVar2 = r8;
                        } catch (avqe e9) {
                            Bundle bundle7 = new Bundle();
                            bundle7.putSerializable("failure_verification_exception_key", e9);
                            h(resultReceiver, 0, bundle7);
                            eventManager.d(e9, avqfVar);
                            avasVar2 = r8;
                        }
                        avasVar = avasVar2;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
                th = th7;
                th = th;
                avasVar = r8;
                try {
                    avasVar.close();
                    throw th;
                } catch (Throwable th8) {
                    th.addSuppressed(th8);
                    throw th;
                }
            }
            String str4 = "failure_verification_exception_key";
            avasVar = avasVar4;
            try {
                Bundle bundle8 = new Bundle();
                try {
                    Bundle bundleExtra3 = intent.getBundleExtra("eventmanager.extra_param");
                    eventManager.getApplicationContext();
                    ekww ekwwVar2 = bsxv.a;
                    bsxr.a(auio.CONSTELLATION_BACKGROUND_SYNC_VERIFICATION);
                    int i2 = 4;
                    try {
                        try {
                            if (intent.hasExtra("eventmanager.max_verification_age_key")) {
                                try {
                                    String stringExtra3 = intent.getStringExtra("eventmanager.policy_id_key");
                                    avqfVar.d = stringExtra3;
                                    resultReceiver2 = resultReceiver;
                                    try {
                                        long longExtra = intent.getLongExtra("eventmanager.max_verification_age_key", -1L);
                                        String stringExtra4 = intent.getStringExtra("eventmanager.certificate_hash_key");
                                        resultReceiver3 = resultReceiver2;
                                        try {
                                            String stringExtra5 = intent.getStringExtra("eventmanager.token_nonce_key");
                                            String stringExtra6 = intent.getStringExtra("eventmanager.calling_package_key");
                                            avasVar.n();
                                            Context context = avasVar.c;
                                            str2 = str4;
                                            try {
                                                List c4 = avqn.b(context, avqfVar).c(avqfVar, context);
                                                List j2 = avas.j(bundleExtra3);
                                                if (!avbz.k(j2, "one_time_verification").equals("True")) {
                                                    try {
                                                        if (!avasVar.r(avqfVar, j2, stringExtra3, stringExtra6)) {
                                                            avasVar.b.h("Device is not consented", new Object[0]);
                                                            throw new avqb();
                                                        }
                                                    } catch (avqe e10) {
                                                        e = e10;
                                                        bundle = bundle8;
                                                        resultReceiver2 = resultReceiver3;
                                                        str4 = str2;
                                                        bundle.putSerializable(str4, e);
                                                        h(resultReceiver2, 0, bundle);
                                                        eventManager.d(e, avqfVar);
                                                        avasVar.close();
                                                    }
                                                }
                                                ArrayList arrayList3 = new ArrayList();
                                                if (c4.isEmpty()) {
                                                    arrayList = arrayList3;
                                                    bundle2 = bundle8;
                                                } else {
                                                    Map d = avqn.b(context, avqfVar).d(avqfVar, context);
                                                    Map f = avqn.b(context, avqfVar).f();
                                                    Map c5 = avoy.a().c(avqfVar);
                                                    ArrayList arrayList4 = new ArrayList();
                                                    bundle2 = bundle8;
                                                    Iterator it = avqfVar.h.iterator();
                                                    while (it.hasNext()) {
                                                        try {
                                                            Iterator it2 = it;
                                                            String str5 = (String) it.next();
                                                            avqfVar2 = avqfVar;
                                                            try {
                                                                fgrc v2 = fmfh.a.v();
                                                                ArrayList arrayList5 = arrayList3;
                                                                if (!v2.b.L()) {
                                                                    v2.U();
                                                                }
                                                                fmfh fmfhVar = (fmfh) v2.b;
                                                                str5.getClass();
                                                                fmfhVar.b = str5;
                                                                arrayList4.add((fmfh) v2.Q());
                                                                arrayList3 = arrayList5;
                                                                it = it2;
                                                                avqfVar = avqfVar2;
                                                            } catch (avqe e11) {
                                                                e = e11;
                                                                eventManager = this;
                                                                resultReceiver2 = resultReceiver3;
                                                                str4 = str2;
                                                                bundle = bundle2;
                                                                avqfVar = avqfVar2;
                                                                bundle.putSerializable(str4, e);
                                                                h(resultReceiver2, 0, bundle);
                                                                eventManager.d(e, avqfVar);
                                                                avasVar.close();
                                                            }
                                                        } catch (avqe e12) {
                                                            e = e12;
                                                            eventManager = this;
                                                            resultReceiver2 = resultReceiver3;
                                                            str4 = str2;
                                                            bundle = bundle2;
                                                            bundle.putSerializable(str4, e);
                                                            h(resultReceiver2, 0, bundle);
                                                            eventManager.d(e, avqfVar);
                                                            avasVar.close();
                                                        }
                                                    }
                                                    ArrayList arrayList6 = arrayList3;
                                                    avqfVar2 = avqfVar;
                                                    try {
                                                        Iterator it3 = c4.iterator();
                                                        while (it3.hasNext()) {
                                                            avqm avqmVar = (avqm) it3.next();
                                                            String str6 = avqmVar.a;
                                                            Iterator it4 = it3;
                                                            String str7 = stringExtra5;
                                                            String str8 = stringExtra6;
                                                            String str9 = stringExtra4;
                                                            avasVar.b.j("observed a imsi ".concat(str6), new Object[0]);
                                                            String str10 = avqmVar.b;
                                                            String str11 = avqmVar.c;
                                                            elgo elgoVar = avqmVar.d;
                                                            fmgc fmgcVar = (fmgc) fmgd.a.v();
                                                            fmgcVar.k(str6);
                                                            if (!TextUtils.isEmpty(str10)) {
                                                                if (!fmgcVar.b.L()) {
                                                                    fmgcVar.U();
                                                                }
                                                                ((fmgd) fmgcVar.b).c = str10;
                                                            }
                                                            if (!TextUtils.isEmpty(str11)) {
                                                                if (!fmgcVar.b.L()) {
                                                                    fmgcVar.U();
                                                                }
                                                                ((fmgd) fmgcVar.b).d = str11;
                                                            }
                                                            fmgcVar.a(elgoVar);
                                                            fmga fmgaVar = (fmga) fmgb.a.v();
                                                            if (!fmgaVar.b.L()) {
                                                                fmgaVar.U();
                                                            }
                                                            fmgb fmgbVar = (fmgb) fmgaVar.b;
                                                            fmgd fmgdVar = (fmgd) fmgcVar.Q();
                                                            fmgdVar.getClass();
                                                            fmgbVar.c = fmgdVar;
                                                            fmgbVar.b |= 1;
                                                            fmgaVar.a(arrayList4);
                                                            if (d.containsKey(str6)) {
                                                                fmhj fmhjVar = (fmhj) d.get(str6);
                                                                fgrc fgrcVar = (fgrc) fmhjVar.iQ(5, null);
                                                                fgrcVar.X(fmhjVar);
                                                                fmhgVar = (fmhg) fgrcVar;
                                                            } else {
                                                                fmhgVar = null;
                                                            }
                                                            if (f == null || !f.containsKey(str6)) {
                                                                arrayList2 = arrayList4;
                                                                map = d;
                                                                avreVar = new avre(context);
                                                                fgrc v3 = fmge.a.v();
                                                                int i3 = avcw.b;
                                                                if (!v3.b.L()) {
                                                                    v3.U();
                                                                }
                                                                fgri fgriVar = v3.b;
                                                                ((fmge) fgriVar).c = i3;
                                                                int i4 = avcw.c;
                                                                if (!fgriVar.L()) {
                                                                    v3.U();
                                                                }
                                                                ((fmge) v3.b).b = i4;
                                                                if (!fmgaVar.b.L()) {
                                                                    fmgaVar.U();
                                                                }
                                                                fmgb fmgbVar2 = (fmgb) fmgaVar.b;
                                                                fmge fmgeVar = (fmge) v3.Q();
                                                                fmgeVar.getClass();
                                                                fmgbVar2.d = fmgeVar;
                                                                fmgbVar2.b |= 2;
                                                            } else {
                                                                Integer num = (Integer) f.get(str6);
                                                                int intValue = num.intValue();
                                                                if (auub.f()) {
                                                                    fgrc v4 = fmge.a.v();
                                                                    arrayList2 = arrayList4;
                                                                    if (!v4.b.L()) {
                                                                        v4.U();
                                                                    }
                                                                    ((fmge) v4.b).c = intValue;
                                                                    slotIndex = SubscriptionManager.getSlotIndex(intValue);
                                                                    map = d;
                                                                    if (!v4.b.L()) {
                                                                        v4.U();
                                                                    }
                                                                    ((fmge) v4.b).b = slotIndex;
                                                                    if (!fmgaVar.b.L()) {
                                                                        fmgaVar.U();
                                                                    }
                                                                    fmgb fmgbVar3 = (fmgb) fmgaVar.b;
                                                                    fmge fmgeVar2 = (fmge) v4.Q();
                                                                    fmgeVar2.getClass();
                                                                    fmgbVar3.d = fmgeVar2;
                                                                    fmgbVar3.b |= 2;
                                                                } else {
                                                                    arrayList2 = arrayList4;
                                                                    map = d;
                                                                    fgrc v5 = fmge.a.v();
                                                                    if (!v5.b.L()) {
                                                                        v5.U();
                                                                    }
                                                                    fgri fgriVar2 = v5.b;
                                                                    ((fmge) fgriVar2).c = intValue;
                                                                    if (!fgriVar2.L()) {
                                                                        v5.U();
                                                                    }
                                                                    ((fmge) v5.b).b = intValue;
                                                                    if (!fmgaVar.b.L()) {
                                                                        fmgaVar.U();
                                                                    }
                                                                    fmgb fmgbVar4 = (fmgb) fmgaVar.b;
                                                                    fmge fmgeVar3 = (fmge) v5.Q();
                                                                    fmgeVar3.getClass();
                                                                    fmgbVar4.d = fmgeVar3;
                                                                    fmgbVar4.b |= 2;
                                                                }
                                                                if (fmhgVar != null && fpcw.i()) {
                                                                    if (!fmhgVar.b.L()) {
                                                                        fmhgVar.U();
                                                                    }
                                                                    fmhj fmhjVar2 = (fmhj) fmhgVar.b;
                                                                    fmhj fmhjVar3 = fmhj.a;
                                                                    fmhjVar2.s = fgtj.a;
                                                                    fmhgVar.k(avasVar.h.d(intValue));
                                                                }
                                                                if (fmhgVar != null && fpcw.j()) {
                                                                    if (!fmhgVar.b.L()) {
                                                                        fmhgVar.U();
                                                                    }
                                                                    fmhj fmhjVar4 = (fmhj) fmhgVar.b;
                                                                    fmhj fmhjVar5 = fmhj.a;
                                                                    fmhjVar4.v = fgtj.a;
                                                                    fmhgVar.l(avasVar.h.e(intValue));
                                                                }
                                                                if (fmhgVar == null) {
                                                                    fmhgVar = null;
                                                                } else if (c5.containsKey(num)) {
                                                                    if (!fmhgVar.b.L()) {
                                                                        fmhgVar.U();
                                                                    }
                                                                    fmhj fmhjVar6 = (fmhj) fmhgVar.b;
                                                                    fmhj fmhjVar7 = fmhj.a;
                                                                    fgtj fgtjVar = fgtj.a;
                                                                    fmhjVar6.u = fgtjVar;
                                                                    fmhgVar.m((Iterable) ((Pair) c5.get(num)).first);
                                                                    if (!fmhgVar.b.L()) {
                                                                        fmhgVar.U();
                                                                    }
                                                                    ((fmhj) fmhgVar.b).t = fgtjVar;
                                                                    fmhgVar.a((Iterable) ((Pair) c5.get(num)).second);
                                                                }
                                                                avreVar = avasVar.c(intValue, c4.size());
                                                            }
                                                            avasVar.i.put(str6, avreVar);
                                                            if (auub.f() && fpeq.f()) {
                                                                avasVar.j.put(str6, new avqu(avasVar.g));
                                                            }
                                                            fmgr fmgrVar = (fmgr) fmgt.a.v();
                                                            if (fmhgVar != null) {
                                                                if (!fmgrVar.b.L()) {
                                                                    fmgrVar.U();
                                                                }
                                                                fmgt fmgtVar = (fmgt) fmgrVar.b;
                                                                fmhj fmhjVar8 = (fmhj) fmhgVar.Q();
                                                                fmhjVar8.getClass();
                                                                fmgtVar.g = fmhjVar8;
                                                                fmgtVar.b |= 2;
                                                            }
                                                            if (!fmgrVar.b.L()) {
                                                                fmgrVar.U();
                                                            }
                                                            ((fmgt) fmgrVar.b).f = fmgs.a(3);
                                                            fgrc v6 = fmgu.a.v();
                                                            if (!v6.b.L()) {
                                                                v6.U();
                                                            }
                                                            fmgu fmguVar = (fmgu) v6.b;
                                                            fmgb fmgbVar5 = (fmgb) fmgaVar.Q();
                                                            fmgbVar5.getClass();
                                                            fmguVar.c = fmgbVar5;
                                                            fmguVar.b = 1;
                                                            if (!fmgrVar.b.L()) {
                                                                fmgrVar.U();
                                                            }
                                                            fmgt fmgtVar2 = (fmgt) fmgrVar.b;
                                                            fmgu fmguVar2 = (fmgu) v6.Q();
                                                            fmguVar2.getClass();
                                                            fmgtVar2.e = fmguVar2;
                                                            fmgtVar2.b |= 1;
                                                            fmgrVar.a(avas.j(bundleExtra3));
                                                            fgrc v7 = fmgj.a.v();
                                                            if (!v7.b.L()) {
                                                                v7.U();
                                                            }
                                                            fgri fgriVar3 = v7.b;
                                                            stringExtra3.getClass();
                                                            ((fmgj) fgriVar3).c = stringExtra3;
                                                            if (!fgriVar3.L()) {
                                                                v7.U();
                                                            }
                                                            fgri fgriVar4 = v7.b;
                                                            ((fmgj) fgriVar4).d = longExtra;
                                                            if (!fgriVar4.L()) {
                                                                v7.U();
                                                            }
                                                            fmgj fmgjVar = (fmgj) v7.b;
                                                            str8.getClass();
                                                            fmgjVar.f = str8;
                                                            fgrc v8 = fmfn.a.v();
                                                            if (!v8.b.L()) {
                                                                v8.U();
                                                            }
                                                            fgri fgriVar5 = v8.b;
                                                            str9.getClass();
                                                            ((fmfn) fgriVar5).b = str9;
                                                            if (!fgriVar5.L()) {
                                                                v8.U();
                                                            }
                                                            fmfn fmfnVar = (fmfn) v8.b;
                                                            str7.getClass();
                                                            fmfnVar.c = str7;
                                                            if (!v7.b.L()) {
                                                                v7.U();
                                                            }
                                                            fmgj fmgjVar2 = (fmgj) v7.b;
                                                            fmfn fmfnVar2 = (fmfn) v8.Q();
                                                            fmfnVar2.getClass();
                                                            fmgjVar2.e = fmfnVar2;
                                                            fmgjVar2.b |= 1;
                                                            if (!fmgrVar.b.L()) {
                                                                fmgrVar.U();
                                                            }
                                                            fmgt fmgtVar3 = (fmgt) fmgrVar.b;
                                                            fmgj fmgjVar3 = (fmgj) v7.Q();
                                                            fmgjVar3.getClass();
                                                            fmgtVar3.i = fmgjVar3;
                                                            fmgtVar3.b |= 4;
                                                            fmct d2 = avas.d();
                                                            fgrc fgrcVar2 = (fgrc) d2.iQ(5, null);
                                                            fgrcVar2.X(d2);
                                                            fmcs fmcsVar = (fmcs) fgrcVar2;
                                                            fgrc v9 = fmdd.a.v();
                                                            String a5 = avreVar.a();
                                                            if (!v9.b.L()) {
                                                                v9.U();
                                                            }
                                                            fmdd fmddVar = (fmdd) v9.b;
                                                            a5.getClass();
                                                            fmddVar.b = a5;
                                                            if (!fmcsVar.b.L()) {
                                                                fmcsVar.U();
                                                            }
                                                            fmct fmctVar = (fmct) fmcsVar.b;
                                                            fmdd fmddVar2 = (fmdd) v9.Q();
                                                            fmct fmctVar2 = fmct.a;
                                                            fmddVar2.getClass();
                                                            fmctVar.d = fmddVar2;
                                                            fmctVar.b |= 1;
                                                            if (!fmgrVar.b.L()) {
                                                                fmgrVar.U();
                                                            }
                                                            fmgt fmgtVar4 = (fmgt) fmgrVar.b;
                                                            fmct fmctVar3 = (fmct) fmcsVar.Q();
                                                            fmctVar3.getClass();
                                                            fmgtVar4.j = fmctVar3;
                                                            fmgtVar4.b |= 8;
                                                            ArrayList arrayList7 = arrayList6;
                                                            arrayList7.add((fmgt) fmgrVar.Q());
                                                            arrayList6 = arrayList7;
                                                            stringExtra6 = str8;
                                                            stringExtra4 = str9;
                                                            it3 = it4;
                                                            arrayList4 = arrayList2;
                                                            d = map;
                                                            stringExtra5 = str7;
                                                        }
                                                        arrayList = arrayList6;
                                                        avqfVar = avqfVar2;
                                                    } catch (avqe e13) {
                                                        e = e13;
                                                        avqfVar = avqfVar2;
                                                        eventManager = this;
                                                        resultReceiver2 = resultReceiver3;
                                                        str4 = str2;
                                                        bundle = bundle2;
                                                        bundle.putSerializable(str4, e);
                                                        h(resultReceiver2, 0, bundle);
                                                        eventManager.d(e, avqfVar);
                                                        avasVar.close();
                                                    }
                                                }
                                                g = avasVar.g(avasVar.k(avqfVar, avasVar.m(avqfVar, arrayList)));
                                            } catch (avqe e14) {
                                                e = e14;
                                                bundle2 = bundle8;
                                            }
                                        } catch (avqe e15) {
                                            e = e15;
                                            bundle2 = bundle8;
                                            eventManager = this;
                                            resultReceiver2 = resultReceiver3;
                                            bundle = bundle2;
                                            bundle.putSerializable(str4, e);
                                            h(resultReceiver2, 0, bundle);
                                            eventManager.d(e, avqfVar);
                                            avasVar.close();
                                        }
                                    } catch (avqe e16) {
                                        e = e16;
                                        bundle2 = bundle8;
                                        eventManager = this;
                                        bundle = bundle2;
                                        bundle.putSerializable(str4, e);
                                        h(resultReceiver2, 0, bundle);
                                        eventManager.d(e, avqfVar);
                                        avasVar.close();
                                    }
                                } catch (avqe e17) {
                                    e = e17;
                                    bundle2 = bundle8;
                                    resultReceiver3 = resultReceiver;
                                }
                            } else {
                                str2 = str4;
                                bundle2 = bundle8;
                                resultReceiver3 = resultReceiver;
                                try {
                                    if (intent.hasExtra("eventmanager.verify_phone_number_request_key")) {
                                        VerifyPhoneNumberRequest verifyPhoneNumberRequest = (VerifyPhoneNumberRequest) intent.getParcelableExtra("eventmanager.verify_phone_number_request_key");
                                        String str12 = verifyPhoneNumberRequest.a;
                                        avqfVar.d = str12;
                                        String stringExtra7 = intent.getStringExtra("eventmanager.calling_package_key");
                                        avasVar.n();
                                        Context context2 = avasVar.c;
                                        List c6 = avqn.b(context2, avqfVar).c(avqfVar, context2);
                                        List j3 = avas.j(verifyPhoneNumberRequest.d);
                                        if (!avbz.k(j3, "one_time_verification").equals("True") && !avasVar.r(avqfVar, j3, str12, stringExtra7)) {
                                            avasVar.b.h("Device is not consented", new Object[0]);
                                            throw new avqb();
                                        }
                                        List<fmgt> k = avasVar.k(avqfVar, avasVar.m(avqfVar, avasVar.i(avqfVar, stringExtra7, verifyPhoneNumberRequest, c6)));
                                        HashSet hashSet = new HashSet();
                                        Iterator it5 = verifyPhoneNumberRequest.e.iterator();
                                        while (it5.hasNext()) {
                                            hashSet.add(((ImsiRequest) it5.next()).a);
                                        }
                                        g = new HashMap();
                                        g.put("UPI_FEATURES_ENABLED", new Bundle());
                                        if (avasVar.s(avqfVar)) {
                                            g.put("SKIP_STORING_VERIFS_ENABLED", new Bundle());
                                        }
                                        for (fmgt fmgtVar5 : k) {
                                            if (hashSet.isEmpty()) {
                                                fmgu fmguVar3 = fmgtVar5.e;
                                                if (fmguVar3 == null) {
                                                    fmguVar3 = fmgu.a;
                                                }
                                                fmgd fmgdVar2 = (fmguVar3.b == 1 ? (fmgb) fmguVar3.c : fmgb.a).c;
                                                if (fmgdVar2 == null) {
                                                    fmgdVar2 = fmgd.a;
                                                }
                                                str3 = (String) fmgdVar2.b.get(0);
                                            } else {
                                                str3 = null;
                                            }
                                            if (str3 == null) {
                                                fmgu fmguVar4 = fmgtVar5.e;
                                                if (fmguVar4 == null) {
                                                    fmguVar4 = fmgu.a;
                                                }
                                                fmgd fmgdVar3 = (fmguVar4.b == 1 ? (fmgb) fmguVar4.c : fmgb.a).c;
                                                if (fmgdVar3 == null) {
                                                    fmgdVar3 = fmgd.a;
                                                }
                                                Iterator it6 = fmgdVar3.b.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        String str13 = (String) it6.next();
                                                        if (hashSet.contains(str13)) {
                                                            str3 = str13;
                                                        }
                                                    }
                                                }
                                            }
                                            if (str3 == null) {
                                                avasVar.b.h("Verification for %s was not returned", null);
                                            } else {
                                                Bundle a6 = avasVar.a(fmgtVar5);
                                                avqi.e();
                                                if (avqi.d(fmgtVar5)) {
                                                    if (avasVar.s(avqfVar)) {
                                                        a6.putInt("result", 1);
                                                        a6.putString("phone_number", (fmgtVar5.c == 3 ? (fmgv) fmgtVar5.d : fmgv.a).c);
                                                        a6.putInt("verification_method", (fmgtVar5.c == 3 ? (fmgv) fmgtVar5.d : fmgv.a).e);
                                                        fgub fgubVar = (fmgtVar5.c == 3 ? (fmgv) fmgtVar5.d : fmgv.a).d;
                                                        if (fgubVar == null) {
                                                            fgubVar = fgub.a;
                                                        }
                                                        a6.putLong("verification_time_millis", fgvn.d(fgubVar).toEpochMilli());
                                                    } else {
                                                        a6.putString("phone_number", (fmgtVar5.c == 3 ? (fmgv) fmgtVar5.d : fmgv.a).c);
                                                        a6.putInt("result", 1);
                                                    }
                                                    i = i2;
                                                } else {
                                                    avqi.e();
                                                    if (avqi.c(fmgtVar5)) {
                                                        a6.putInt("result", 6);
                                                        i = i2;
                                                        fmcp fmcpVar = (fmgtVar5.c == i ? (fmft) fmgtVar5.d : fmft.a).c;
                                                        if (fmcpVar == null) {
                                                            fmcpVar = fmcp.a;
                                                        }
                                                        fmcr b8 = fmcr.b(fmcpVar.f);
                                                        if (b8 == null) {
                                                            b8 = fmcr.UNRECOGNIZED;
                                                        }
                                                        a6.putInt("verification_method", b8.a());
                                                    } else {
                                                        i = i2;
                                                        avqi.e();
                                                        if (fmgtVar5 != null && !avqh.b(avqi.a(fmgtVar5)) && (b = fmgs.b(fmgtVar5.f)) != 0 && b == 3) {
                                                            EnumMap enumMap = avas.a;
                                                            switch ((fmgtVar5.c == 9 ? (fmgq) fmgtVar5.d : fmgq.a).b) {
                                                                case 0:
                                                                    fmgpVar = fmgp.UNKNOWN_REASON;
                                                                    break;
                                                                case 1:
                                                                    fmgpVar = fmgp.THROTTLED;
                                                                    break;
                                                                case 2:
                                                                    fmgpVar = fmgp.FAILED;
                                                                    break;
                                                                case 3:
                                                                    fmgpVar = fmgp.SKIPPED;
                                                                    break;
                                                                case 4:
                                                                    fmgpVar = fmgp.NOT_REQUIRED;
                                                                    break;
                                                                case 5:
                                                                    fmgpVar = fmgp.PHONE_NUMBER_ENTRY_REQUIRED;
                                                                    break;
                                                                case 6:
                                                                    fmgpVar = fmgp.INELIGIBLE;
                                                                    break;
                                                                default:
                                                                    fmgpVar = null;
                                                                    break;
                                                            }
                                                            if (fmgpVar == null) {
                                                                fmgpVar = fmgp.UNRECOGNIZED;
                                                            }
                                                            a6.putInt("result", ((Integer) enumMap.get(fmgpVar)).intValue());
                                                            fmcr b9 = fmcr.b((fmgtVar5.c == 9 ? (fmgq) fmgtVar5.d : fmgq.a).d);
                                                            if (b9 == null) {
                                                                b9 = fmcr.UNRECOGNIZED;
                                                            }
                                                            a6.putInt("verification_method", b9.a());
                                                            fmhe fmheVar = (fmgtVar5.c == 9 ? (fmgq) fmgtVar5.d : fmgq.a).c;
                                                            if (fmheVar == null) {
                                                                fmheVar = fmhe.a;
                                                            }
                                                            a6.putLong("retry_after", avpn.b(fmheVar));
                                                        }
                                                        a6.putInt("result", 0);
                                                    }
                                                }
                                                g.put(str3, a6);
                                                i2 = i;
                                            }
                                        }
                                    } else if (intExtra == 7) {
                                        avasVar.n();
                                        Context context3 = avasVar.c;
                                        List c7 = avqn.b(context3, avqfVar).c(avqfVar, context3);
                                        List j4 = avas.j(bundleExtra3);
                                        if (!avbz.k(j4, "one_time_verification").equals("True")) {
                                            avasVar.o(avqfVar);
                                            avasVar.f.a();
                                            fmcm fmcmVar = fmcm.UNKNOWN_CLIENT;
                                            avbz avbzVar3 = avasVar.d;
                                            fmfi c8 = avbzVar3.c(avqfVar, fmcmVar);
                                            if (!j4.isEmpty()) {
                                                c8.a(j4);
                                            }
                                            if (!(fpea.a.lK().p() ? avbz.s(avbzVar3.d(avqfVar, c8), fmcmVar) : avbzVar3.q(avqfVar, c8, fmcmVar))) {
                                                avasVar.b.h("Device is not consented", new Object[0]);
                                                throw new avqb();
                                            }
                                        }
                                        g = avasVar.g(avasVar.k(avqfVar, avasVar.m(avqfVar, avasVar.h(avqfVar, j4, c7))));
                                    } else {
                                        avasVar.n();
                                        Context context4 = avasVar.c;
                                        g = avasVar.g(avasVar.l(avqfVar, bundleExtra3, avqn.b(context4, avqfVar).c(avqfVar, context4)));
                                    }
                                } catch (avqe e18) {
                                    e = e18;
                                    eventManager = this;
                                    resultReceiver2 = resultReceiver3;
                                    bundle = bundle2;
                                    str4 = str2;
                                    bundle.putSerializable(str4, e);
                                    h(resultReceiver2, 0, bundle);
                                    eventManager.d(e, avqfVar);
                                    avasVar.close();
                                }
                            }
                            bundle = bundle2;
                        } catch (avqe e19) {
                            e = e19;
                        }
                        try {
                            bundle.putSerializable("success_server_result_data_key", g);
                            resultReceiver2 = resultReceiver3;
                            try {
                                h(resultReceiver2, 1, bundle);
                                eventManager = this;
                                try {
                                    eventManager.e(avqfVar);
                                } catch (avqe e20) {
                                    e = e20;
                                    str4 = str2;
                                    bundle.putSerializable(str4, e);
                                    h(resultReceiver2, 0, bundle);
                                    eventManager.d(e, avqfVar);
                                    avasVar.close();
                                }
                            } catch (avqe e21) {
                                e = e21;
                                eventManager = this;
                            }
                        } catch (avqe e22) {
                            e = e22;
                            eventManager = this;
                            resultReceiver2 = resultReceiver3;
                            str4 = str2;
                            bundle.putSerializable(str4, e);
                            h(resultReceiver2, 0, bundle);
                            eventManager.d(e, avqfVar);
                            avasVar.close();
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        th = th;
                        avasVar.close();
                        throw th;
                    }
                } catch (avqe e23) {
                    e = e23;
                    bundle = bundle8;
                    resultReceiver2 = resultReceiver;
                }
            } catch (Throwable th10) {
                th = th10;
            }
            avasVar.close();
        }
    }
}
