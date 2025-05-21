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
import defpackage.arni;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asqh;
import defpackage.aswh;
import defpackage.aswq;
import defpackage.asxw;
import defpackage.asyd;
import defpackage.asym;
import defpackage.asyt;
import defpackage.aszi;
import defpackage.aszo;
import defpackage.aszr;
import defpackage.aszu;
import defpackage.aszw;
import defpackage.atkv;
import defpackage.atkx;
import defpackage.atle;
import defpackage.atlk;
import defpackage.atlw;
import defpackage.atlx;
import defpackage.atly;
import defpackage.atmb;
import defpackage.atmc;
import defpackage.atme;
import defpackage.atmf;
import defpackage.atmg;
import defpackage.atmj;
import defpackage.atmk;
import defpackage.atmr;
import defpackage.atnb;
import defpackage.atne;
import defpackage.bnyw;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.eijr;
import defpackage.eitj;
import defpackage.enwb;
import defpackage.enwd;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.feeq;
import defpackage.fjmp;
import defpackage.fjms;
import defpackage.fjmu;
import defpackage.fjmv;
import defpackage.fjmw;
import defpackage.fjng;
import defpackage.fjou;
import defpackage.fjow;
import defpackage.fjpd;
import defpackage.fjpf;
import defpackage.fjpk;
import defpackage.fjpl;
import defpackage.fjpq;
import defpackage.fjpt;
import defpackage.fjpw;
import defpackage.fjqd;
import defpackage.fjqe;
import defpackage.fjqf;
import defpackage.fjqg;
import defpackage.fjqh;
import defpackage.fjqi;
import defpackage.fjql;
import defpackage.fjqm;
import defpackage.fjqs;
import defpackage.fjqt;
import defpackage.fjqu;
import defpackage.fjqv;
import defpackage.fjqw;
import defpackage.fjqx;
import defpackage.fjqy;
import defpackage.fjrh;
import defpackage.fjrj;
import defpackage.fjrm;
import defpackage.fmkc;
import defpackage.fmlf;
import defpackage.fmmf;
import defpackage.fmml;
import defpackage.fmmv;
import defpackage.ujz;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class EventManager extends IntentOperation {
    private static final arxo a = atmg.a("event_manager");
    private boolean b = false;
    private Exception c;
    private aszu d;

    private final String a() {
        try {
            String c = bnyw.g(getApplicationContext()).c(fmmf.d(), "GCM");
            SharedPreferences.Editor edit = ((aszw) this.d).c.edit();
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

    private final String b(Intent intent, atmc atmcVar) {
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
                        a2 = ((aszw) this.d).c.getString("gcm_token", null);
                    }
                }
                str = a2;
            }
            atmcVar.f = str;
        }
        return str;
    }

    private final ArrayList c(Intent intent, atmc atmcVar) {
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
                atle.d();
                arrayList2.addAll(atle.b(atmcVar, fmmf.c(), getBaseContext(), new Bundle()).values());
                arrayList = arrayList2;
            }
            atmcVar.g = arrayList;
        }
        return arrayList;
    }

    private final void d(atmb atmbVar, atmc atmcVar) {
        if (atmbVar.b) {
            aswh b = aswh.b();
            Context applicationContext = getApplicationContext();
            if (fmml.a.a().v()) {
                Pair g = aszi.b().a(applicationContext).g();
                if (((Long) g.first).longValue() == -1) {
                    eitj eitjVar = b.b;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!eitjVar.isEmpty()) {
                        long longValue = ((Long) eitjVar.get(0)).longValue() + currentTimeMillis;
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        aszu a2 = aszi.b().a(applicationContext2);
                        arni arniVar = ((aszw) a2).c;
                        long j = arniVar.getLong("sync_retry_scheduling_frozen_timestamp_in_millis", 0L);
                        if (j > System.currentTimeMillis()) {
                            aswh.a.d("Sync re-try is frozen util %s", atlk.d(j));
                        } else {
                            a2.l();
                            long min = Math.min(longValue, aswh.a(applicationContext, currentTimeMillis, null));
                            RefreshGcmTaskChimeraService.e(applicationContext2, min, true);
                            long currentTimeMillis2 = System.currentTimeMillis() + b.c;
                            SharedPreferences.Editor edit = arniVar.edit();
                            edit.putLong("sync_retry_scheduling_frozen_timestamp_in_millis", currentTimeMillis2);
                            edit.apply();
                            a2.w(min, 1);
                        }
                    }
                } else {
                    Context applicationContext3 = applicationContext.getApplicationContext();
                    aszu a3 = aszi.b().a(applicationContext3);
                    int intValue = ((Integer) g.second).intValue();
                    if (((Long) g.first).longValue() == -1) {
                        aswh.a.d("Cannot schedule the next re-try time: current one is non-existing", new Object[0]);
                        a3.m();
                    } else {
                        eitj eitjVar2 = b.b;
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (intValue >= eitjVar2.size()) {
                            aswh.a.d("Cannot schedule the next re-try time: reach the end of the scheduling.", new Object[0]);
                            a3.m();
                            a3.l();
                            aswh.d(applicationContext);
                        } else {
                            long longValue2 = currentTimeMillis3 + ((Long) eitjVar2.get(intValue)).longValue();
                            RefreshGcmTaskChimeraService.e(applicationContext3, longValue2, true);
                            a3.w(longValue2, intValue + 1);
                        }
                    }
                }
            } else {
                aswh.a.d("Retry sync is disabled", new Object[0]);
            }
        }
        f();
        atmcVar.a();
    }

    private final void e(atmc atmcVar) {
        Context applicationContext = getApplicationContext();
        aswh.b();
        aszu a2 = aszi.b().a(applicationContext.getApplicationContext());
        a2.l();
        a2.m();
        aswh.b();
        aswh.c(applicationContext, atmcVar);
        f();
        atmcVar.a();
    }

    private final void f() {
        if (fmkc.i()) {
            if (!this.d.y()) {
                return;
            }
        } else if (!this.d.z()) {
            return;
        }
        if (fmlf.i()) {
            asyd.a().b();
            RefreshGcmTaskChimeraService.d(getApplicationContext());
        }
        if (fmlf.j()) {
            asym.i(getApplicationContext()).e();
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
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String str;
        ResultReceiver resultReceiver;
        atmc atmcVar;
        int intExtra;
        char c;
        ResultReceiver resultReceiver2;
        Bundle bundle;
        Bundle bundleExtra;
        int i;
        Bundle bundle2;
        ResultReceiver resultReceiver3;
        String stringExtra;
        String str2;
        atmc atmcVar2;
        ArrayList arrayList;
        fjrj fjrjVar;
        ArrayList arrayList2;
        Map map;
        atne atnbVar;
        int slotIndex;
        HashMap g;
        String str3;
        int i2;
        int b;
        fjqs fjqsVar;
        boolean p;
        String str4;
        fjou fjouVar;
        boolean z;
        fjou fjouVar2;
        boolean z2;
        EventManager eventManager = this;
        String action = intent.getAction();
        try {
            eventManager.d = aszi.b().a(eventManager.getBaseContext());
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
        atlw a2 = atlw.a(eventManager);
        if (TextUtils.isEmpty(str)) {
            atmc atmcVar3 = new atmc(UUID.randomUUID().toString());
            a2.o(atmcVar3, enwd.NULL_SESSION_ID);
            atmcVar = atmcVar3;
        } else {
            atmcVar = new atmc(str);
        }
        a2.o(atmcVar, enwd.EVENT_MANAGER_HANDLE_INTENT);
        if (resultReceiver == null) {
            a2.o(atmcVar, enwd.NULL_RESULT_RECEIVER);
        }
        if (Objects.equals(action, "com.google.android.gms.constellation.eventmanager.CACHE_EXTERNAL_CONSENT_ACTIVITY_STATE")) {
            enwd b2 = enwd.b(intent.getIntExtra("eventmanager.external_consent_activity_state", enwd.TOS_CONSENT_EVENT_CANCELED.a()));
            String stringExtra2 = intent.getStringExtra("eventmanager.calling_package_key");
            try {
                aszi.b();
                aszi.c(eventManager.getApplicationContext(), 2).e((aszo) aszr.a.getOrDefault(b2, aszo.FAILED), stringExtra2);
                return;
            } catch (atlx e3) {
                a.g("Could not prepare state cache", e3, new Object[0]);
                a2.g(atmcVar, enwd.TOS_CONSENT_STATE, enwb.TOS_STATE_DB_UNAVAILABLE_FOR_WRITE, e3.getMessage());
                return;
            } catch (atmb e4) {
                a.g("Could not write state in cache", e4, new Object[0]);
                a2.g(atmcVar, enwd.TOS_CONSENT_STATE, enwb.TOS_STATE_WRITE_FAILED, e4.getMessage());
                return;
            }
        }
        if (Objects.equals(action, "com.google.android.gms.constellation.eventmanager.GENERATE_TOKENS") || g(action)) {
            String b3 = eventManager.b(intent, atmcVar);
            ArrayList<String> c2 = eventManager.c(intent, atmcVar);
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
            atlw a3 = atlw.a(eventManager.getBaseContext());
            if (TextUtils.isEmpty(atmcVar.f)) {
                if (eventManager.b) {
                    a3.e(atmcVar, enwd.IID_TOKEN_GENERATION_FAILED, eventManager.c);
                }
                a.m("Event manager is not initialized", new Object[0]);
                enwb enwbVar = enwb.EVENT_MANAGER_NOT_INITIALIZED;
                atkx.a(eventManager.getBaseContext().getApplicationContext());
                atmb atmbVar = new atmb(enwbVar, !atkx.b(eventManager.getBaseContext()));
                eventManager.d(atmbVar, atmcVar);
                Bundle bundle4 = new Bundle();
                bundle4.putSerializable("failure_verification_exception_key", atmbVar);
                h(resultReceiver, 0, bundle4);
                return;
            }
            aswq aswqVar = new aswq(eventManager.getApplicationContext());
            try {
                intExtra = intent.getIntExtra("eventmanager.trigger_type", 0);
                atmcVar.c = intExtra;
                a.h("Starting session. sessionId: %s from trigger: %s", atmcVar.a, Integer.valueOf(intExtra));
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
            } catch (Throwable th) {
                th = th;
            }
            if (c != 0) {
                if (c == 1) {
                    try {
                        if (aswqVar.q(atmcVar)) {
                            h(resultReceiver, 1, null);
                            eventManager.getApplicationContext();
                            eijr eijrVar = bqqe.a;
                            bqqa.a(aseu.CONSTELLATION_BACKGROUND_SYNC_VERIFICATION_IF_STATE_MISMATCH);
                        } else {
                            h(resultReceiver, 2, null);
                        }
                        eventManager.e(atmcVar);
                    } catch (atmb e5) {
                        Bundle bundle5 = new Bundle();
                        bundle5.putSerializable("failure_verification_exception_key", e5);
                        h(resultReceiver, 0, bundle5);
                        eventManager.d(e5, atmcVar);
                    }
                } else if (c == 2) {
                    Bundle bundle6 = new Bundle();
                    try {
                        Bundle bundleExtra2 = intent.getBundleExtra("eventmanager.extra_param");
                        fjmp b4 = fjmp.b(intent.getIntExtra("eventmanager.aster_client", fjmp.UNKNOWN_CLIENT.a()));
                        if (fmkc.g()) {
                            asxw asxwVar = aswqVar.d;
                            List j = aswq.j(bundleExtra2);
                            fjpl c3 = asxwVar.c(atmcVar, b4);
                            if (!j.isEmpty()) {
                                c3.a(j);
                            }
                            ujz a4 = asxwVar.a(atmcVar, c3, b4);
                            bundle6.putSerializable("success_consent_version_key", Integer.valueOf(fjow.a(a4.b)));
                            p = GetAsterismConsentResponse.a(a4.a);
                        } else {
                            p = aswqVar.d.p(atmcVar, aswq.j(bundleExtra2), b4);
                        }
                        bundle6.putSerializable("success_consent_value_key", Boolean.valueOf(p));
                        h(resultReceiver, 4, bundle6);
                    } catch (atmb e6) {
                        bundle6.putSerializable("failure_verification_exception_key", e6);
                        h(resultReceiver, 0, bundle6);
                    }
                } else if (c != 3) {
                    a3.o(atmcVar, enwd.EVENT_MANAGER_INVALID_ACTION);
                } else {
                    Bundle bundle7 = new Bundle();
                    try {
                        Bundle bundleExtra3 = intent.getBundleExtra("eventmanager.extra_param");
                        boolean booleanExtra = intent.getBooleanExtra("eventmanager.consent_value", false);
                        fjmp b5 = fjmp.b(intent.getIntExtra("eventmanager.aster_client", fjmp.UNKNOWN_CLIENT.a()));
                        byte[] byteArrayExtra = intent.getByteArrayExtra("eventmanager.audit_token");
                        String stringExtra3 = intent.getStringExtra("eventmanager.consent_variant");
                        int b6 = fjpf.b(intent.getIntExtra("eventmanager.device_verification_consent_version", fjpf.a(2)));
                        int b7 = fjql.b(intent.getIntExtra("eventmanager.device_verification_consent_source", fjql.a(2)));
                        if (stringExtra3 != null) {
                            String stringExtra4 = intent.getStringExtra("eventmanager.gaia_access_token");
                            String stringExtra5 = intent.getStringExtra("eventmanager.consent_trigger");
                            asxw asxwVar2 = aswqVar.d;
                            fecj u = asxwVar2.u(atmcVar, b5, byteArrayExtra, aswq.j(bundleExtra3));
                            fecj v = fjpt.a.v();
                            if (booleanExtra) {
                                fjouVar2 = fjou.CONSENTED;
                                z2 = true;
                            } else {
                                fjouVar2 = fjou.NO_CONSENT;
                                z2 = false;
                            }
                            if (!v.b.L()) {
                                v.U();
                            }
                            ((fjpt) v.b).c = fjouVar2.a();
                            fecj v2 = fjpk.a.v();
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            fjpk fjpkVar = (fjpk) v2.b;
                            stringExtra4.getClass();
                            fjpkVar.b = stringExtra4;
                            if (!v.b.L()) {
                                v.U();
                            }
                            fjpt fjptVar = (fjpt) v.b;
                            fjpk fjpkVar2 = (fjpk) v2.Q();
                            fjpkVar2.getClass();
                            fjptVar.d = fjpkVar2;
                            fjptVar.b |= 1;
                            if (!v.b.L()) {
                                v.U();
                            }
                            fecp fecpVar = v.b;
                            ((fjpt) fecpVar).e = stringExtra3;
                            if (!fecpVar.L()) {
                                v.U();
                            }
                            fjpt fjptVar2 = (fjpt) v.b;
                            stringExtra5.getClass();
                            fjptVar2.f = stringExtra5;
                            if (!u.b.L()) {
                                u.U();
                            }
                            fjqi fjqiVar = (fjqi) u.b;
                            fjpt fjptVar3 = (fjpt) v.Q();
                            fjqi fjqiVar2 = fjqi.a;
                            fjptVar3.getClass();
                            fjqiVar.g = fjptVar3;
                            fjqiVar.b |= 4;
                            asxwVar2.o(atmcVar, z2, true, (fjqi) u.Q());
                        } else if (SetAsterismConsentRequest.a(b5.a(), fjpf.a(b6), fjql.a(b7))) {
                            asxw asxwVar3 = aswqVar.d;
                            fecj u2 = asxwVar3.u(atmcVar, b5, byteArrayExtra, aswq.j(bundleExtra3));
                            fecj v3 = fjpd.a.v();
                            if (booleanExtra) {
                                fjouVar = fjou.CONSENTED;
                                z = true;
                            } else {
                                fjouVar = fjou.NO_CONSENT;
                                z = false;
                            }
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            ((fjpd) v3.b).b = fjouVar.a();
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            ((fjpd) v3.b).d = fjpf.a(b6);
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            ((fjpd) v3.b).c = fjql.a(b7);
                            if (!u2.b.L()) {
                                u2.U();
                            }
                            fjqi fjqiVar3 = (fjqi) u2.b;
                            fjpd fjpdVar = (fjpd) v3.Q();
                            fjqi fjqiVar4 = fjqi.a;
                            fjpdVar.getClass();
                            fjqiVar3.d = fjpdVar;
                            fjqiVar3.c = 10;
                            asxwVar3.o(atmcVar, z, true, (fjqi) u2.Q());
                        } else {
                            str4 = "failure_verification_exception_key";
                            try {
                                aswqVar.d.t(atmcVar, booleanExtra, true, b5, byteArrayExtra, aswq.j(bundleExtra3), fjow.b(intent.getIntExtra("eventmanager.consent_version", fjow.a(2))));
                                h(resultReceiver, 5, Bundle.EMPTY);
                            } catch (atmb e7) {
                                e = e7;
                                bundle7.putSerializable(str4, e);
                                h(resultReceiver, 0, bundle7);
                                aswqVar.close();
                            }
                        }
                        str4 = "failure_verification_exception_key";
                        h(resultReceiver, 5, Bundle.EMPTY);
                    } catch (atmb e8) {
                        e = e8;
                        str4 = "failure_verification_exception_key";
                    }
                }
                th = th;
                Throwable th2 = th;
                try {
                    aswqVar.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
            String str5 = "failure_verification_exception_key";
            Bundle bundle8 = new Bundle();
            try {
                bundleExtra = intent.getBundleExtra("eventmanager.extra_param");
                eventManager.getApplicationContext();
                eijr eijrVar2 = bqqe.a;
                bqqa.a(aseu.CONSTELLATION_BACKGROUND_SYNC_VERIFICATION);
                i = 4;
            } catch (atmb e9) {
                e = e9;
                resultReceiver2 = resultReceiver;
                bundle = bundle8;
            }
            try {
                try {
                    if (intent.hasExtra("eventmanager.max_verification_age_key")) {
                        try {
                            stringExtra = intent.getStringExtra("eventmanager.policy_id_key");
                            resultReceiver2 = resultReceiver;
                        } catch (atmb e10) {
                            e = e10;
                            resultReceiver3 = resultReceiver;
                        }
                        try {
                            long longExtra = intent.getLongExtra("eventmanager.max_verification_age_key", -1L);
                            String stringExtra6 = intent.getStringExtra("eventmanager.certificate_hash_key");
                            resultReceiver3 = resultReceiver2;
                            try {
                                String stringExtra7 = intent.getStringExtra("eventmanager.token_nonce_key");
                                String stringExtra8 = intent.getStringExtra("eventmanager.calling_package_key");
                                aswqVar.n();
                                Context context = aswqVar.c;
                                str2 = str5;
                                try {
                                    List c4 = atmk.b(context, atmcVar).c(atmcVar, context);
                                    List j2 = aswq.j(bundleExtra);
                                    if (!asxw.k(j2, "one_time_verification").equals("True")) {
                                        try {
                                            if (!aswqVar.r(atmcVar, j2, stringExtra, stringExtra8)) {
                                                aswqVar.b.h("Device is not consented", new Object[0]);
                                                throw new atly();
                                            }
                                        } catch (atmb e11) {
                                            e = e11;
                                            bundle = bundle8;
                                            resultReceiver2 = resultReceiver3;
                                            str5 = str2;
                                            bundle.putSerializable(str5, e);
                                            h(resultReceiver2, 0, bundle);
                                            eventManager.d(e, atmcVar);
                                            aswqVar.close();
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    if (c4.isEmpty()) {
                                        arrayList = arrayList3;
                                        bundle2 = bundle8;
                                    } else {
                                        Map d = atmk.b(context, atmcVar).d(atmcVar, context);
                                        Map f = atmk.b(context, atmcVar).f();
                                        Map c5 = atkv.a().c(atmcVar);
                                        ArrayList arrayList4 = new ArrayList();
                                        bundle2 = bundle8;
                                        Iterator it = atmcVar.g.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                Iterator it2 = it;
                                                String str6 = (String) it.next();
                                                atmcVar2 = atmcVar;
                                                try {
                                                    fecj v4 = fjpk.a.v();
                                                    ArrayList arrayList5 = arrayList3;
                                                    if (!v4.b.L()) {
                                                        v4.U();
                                                    }
                                                    fjpk fjpkVar3 = (fjpk) v4.b;
                                                    str6.getClass();
                                                    fjpkVar3.b = str6;
                                                    arrayList4.add((fjpk) v4.Q());
                                                    arrayList3 = arrayList5;
                                                    it = it2;
                                                    atmcVar = atmcVar2;
                                                } catch (atmb e12) {
                                                    e = e12;
                                                    eventManager = this;
                                                    resultReceiver2 = resultReceiver3;
                                                    str5 = str2;
                                                    bundle = bundle2;
                                                    atmcVar = atmcVar2;
                                                    bundle.putSerializable(str5, e);
                                                    h(resultReceiver2, 0, bundle);
                                                    eventManager.d(e, atmcVar);
                                                    aswqVar.close();
                                                }
                                            } catch (atmb e13) {
                                                e = e13;
                                                eventManager = this;
                                                resultReceiver2 = resultReceiver3;
                                                str5 = str2;
                                                bundle = bundle2;
                                                bundle.putSerializable(str5, e);
                                                h(resultReceiver2, 0, bundle);
                                                eventManager.d(e, atmcVar);
                                                aswqVar.close();
                                            }
                                        }
                                        ArrayList arrayList6 = arrayList3;
                                        atmcVar2 = atmcVar;
                                        try {
                                            Iterator it3 = c4.iterator();
                                            while (it3.hasNext()) {
                                                atmj atmjVar = (atmj) it3.next();
                                                String str7 = atmjVar.a;
                                                Iterator it4 = it3;
                                                String str8 = stringExtra7;
                                                String str9 = stringExtra8;
                                                String str10 = stringExtra6;
                                                aswqVar.b.j("observed a imsi ".concat(str7), new Object[0]);
                                                String str11 = atmjVar.b;
                                                String str12 = atmjVar.c;
                                                eitj eitjVar = atmjVar.d;
                                                fjqf fjqfVar = (fjqf) fjqg.a.v();
                                                fjqfVar.k(str7);
                                                if (!TextUtils.isEmpty(str11)) {
                                                    if (!fjqfVar.b.L()) {
                                                        fjqfVar.U();
                                                    }
                                                    ((fjqg) fjqfVar.b).c = str11;
                                                }
                                                if (!TextUtils.isEmpty(str12)) {
                                                    if (!fjqfVar.b.L()) {
                                                        fjqfVar.U();
                                                    }
                                                    ((fjqg) fjqfVar.b).d = str12;
                                                }
                                                fjqfVar.a(eitjVar);
                                                fjqd fjqdVar = (fjqd) fjqe.a.v();
                                                if (!fjqdVar.b.L()) {
                                                    fjqdVar.U();
                                                }
                                                fjqe fjqeVar = (fjqe) fjqdVar.b;
                                                fjqg fjqgVar = (fjqg) fjqfVar.Q();
                                                fjqgVar.getClass();
                                                fjqeVar.c = fjqgVar;
                                                fjqeVar.b |= 1;
                                                fjqdVar.a(arrayList4);
                                                if (d.containsKey(str7)) {
                                                    fjrm fjrmVar = (fjrm) d.get(str7);
                                                    fecj fecjVar = (fecj) fjrmVar.iB(5, null);
                                                    fecjVar.X(fjrmVar);
                                                    fjrjVar = (fjrj) fecjVar;
                                                } else {
                                                    fjrjVar = null;
                                                }
                                                if (f == null || !f.containsKey(str7)) {
                                                    arrayList2 = arrayList4;
                                                    map = d;
                                                    atnbVar = new atnb(context);
                                                    fecj v5 = fjqh.a.v();
                                                    int i3 = asyt.b;
                                                    if (!v5.b.L()) {
                                                        v5.U();
                                                    }
                                                    fecp fecpVar2 = v5.b;
                                                    ((fjqh) fecpVar2).c = i3;
                                                    int i4 = asyt.c;
                                                    if (!fecpVar2.L()) {
                                                        v5.U();
                                                    }
                                                    ((fjqh) v5.b).b = i4;
                                                    if (!fjqdVar.b.L()) {
                                                        fjqdVar.U();
                                                    }
                                                    fjqe fjqeVar2 = (fjqe) fjqdVar.b;
                                                    fjqh fjqhVar = (fjqh) v5.Q();
                                                    fjqhVar.getClass();
                                                    fjqeVar2.d = fjqhVar;
                                                    fjqeVar2.b |= 2;
                                                } else {
                                                    Integer num = (Integer) f.get(str7);
                                                    int intValue = num.intValue();
                                                    if (asqh.f()) {
                                                        fecj v6 = fjqh.a.v();
                                                        arrayList2 = arrayList4;
                                                        if (!v6.b.L()) {
                                                            v6.U();
                                                        }
                                                        ((fjqh) v6.b).c = intValue;
                                                        slotIndex = SubscriptionManager.getSlotIndex(intValue);
                                                        map = d;
                                                        if (!v6.b.L()) {
                                                            v6.U();
                                                        }
                                                        ((fjqh) v6.b).b = slotIndex;
                                                        if (!fjqdVar.b.L()) {
                                                            fjqdVar.U();
                                                        }
                                                        fjqe fjqeVar3 = (fjqe) fjqdVar.b;
                                                        fjqh fjqhVar2 = (fjqh) v6.Q();
                                                        fjqhVar2.getClass();
                                                        fjqeVar3.d = fjqhVar2;
                                                        fjqeVar3.b |= 2;
                                                    } else {
                                                        arrayList2 = arrayList4;
                                                        map = d;
                                                        fecj v7 = fjqh.a.v();
                                                        if (!v7.b.L()) {
                                                            v7.U();
                                                        }
                                                        fecp fecpVar3 = v7.b;
                                                        ((fjqh) fecpVar3).c = intValue;
                                                        if (!fecpVar3.L()) {
                                                            v7.U();
                                                        }
                                                        ((fjqh) v7.b).b = intValue;
                                                        if (!fjqdVar.b.L()) {
                                                            fjqdVar.U();
                                                        }
                                                        fjqe fjqeVar4 = (fjqe) fjqdVar.b;
                                                        fjqh fjqhVar3 = (fjqh) v7.Q();
                                                        fjqhVar3.getClass();
                                                        fjqeVar4.d = fjqhVar3;
                                                        fjqeVar4.b |= 2;
                                                    }
                                                    if (fjrjVar != null && fmlf.i()) {
                                                        if (!fjrjVar.b.L()) {
                                                            fjrjVar.U();
                                                        }
                                                        fjrm fjrmVar2 = (fjrm) fjrjVar.b;
                                                        fjrm fjrmVar3 = fjrm.a;
                                                        fjrmVar2.s = feeq.a;
                                                        fjrjVar.k(aswqVar.h.e(intValue));
                                                    }
                                                    if (fjrjVar != null && fmlf.j()) {
                                                        if (!fjrjVar.b.L()) {
                                                            fjrjVar.U();
                                                        }
                                                        fjrm fjrmVar4 = (fjrm) fjrjVar.b;
                                                        fjrm fjrmVar5 = fjrm.a;
                                                        fjrmVar4.v = feeq.a;
                                                        fjrjVar.l(aswqVar.h.f(intValue));
                                                    }
                                                    if (fjrjVar == null) {
                                                        fjrjVar = null;
                                                    } else if (c5.containsKey(num)) {
                                                        if (!fjrjVar.b.L()) {
                                                            fjrjVar.U();
                                                        }
                                                        fjrm fjrmVar6 = (fjrm) fjrjVar.b;
                                                        fjrm fjrmVar7 = fjrm.a;
                                                        feeq feeqVar = feeq.a;
                                                        fjrmVar6.u = feeqVar;
                                                        fjrjVar.m((Iterable) ((Pair) c5.get(num)).first);
                                                        if (!fjrjVar.b.L()) {
                                                            fjrjVar.U();
                                                        }
                                                        ((fjrm) fjrjVar.b).t = feeqVar;
                                                        fjrjVar.a((Iterable) ((Pair) c5.get(num)).second);
                                                    }
                                                    atnbVar = aswqVar.c(intValue, c4.size());
                                                }
                                                aswqVar.i.put(str7, atnbVar);
                                                if (asqh.f() && fmmv.f()) {
                                                    aswqVar.j.put(str7, new atmr(aswqVar.g));
                                                }
                                                fjqu fjquVar = (fjqu) fjqw.a.v();
                                                if (fjrjVar != null) {
                                                    if (!fjquVar.b.L()) {
                                                        fjquVar.U();
                                                    }
                                                    fjqw fjqwVar = (fjqw) fjquVar.b;
                                                    fjrm fjrmVar8 = (fjrm) fjrjVar.Q();
                                                    fjrmVar8.getClass();
                                                    fjqwVar.g = fjrmVar8;
                                                    fjqwVar.b |= 2;
                                                }
                                                if (!fjquVar.b.L()) {
                                                    fjquVar.U();
                                                }
                                                ((fjqw) fjquVar.b).f = fjqv.a(3);
                                                fecj v8 = fjqx.a.v();
                                                if (!v8.b.L()) {
                                                    v8.U();
                                                }
                                                fjqx fjqxVar = (fjqx) v8.b;
                                                fjqe fjqeVar5 = (fjqe) fjqdVar.Q();
                                                fjqeVar5.getClass();
                                                fjqxVar.c = fjqeVar5;
                                                fjqxVar.b = 1;
                                                if (!fjquVar.b.L()) {
                                                    fjquVar.U();
                                                }
                                                fjqw fjqwVar2 = (fjqw) fjquVar.b;
                                                fjqx fjqxVar2 = (fjqx) v8.Q();
                                                fjqxVar2.getClass();
                                                fjqwVar2.e = fjqxVar2;
                                                fjqwVar2.b |= 1;
                                                fjquVar.a(aswq.j(bundleExtra));
                                                fecj v9 = fjqm.a.v();
                                                if (!v9.b.L()) {
                                                    v9.U();
                                                }
                                                fecp fecpVar4 = v9.b;
                                                stringExtra.getClass();
                                                ((fjqm) fecpVar4).c = stringExtra;
                                                if (!fecpVar4.L()) {
                                                    v9.U();
                                                }
                                                fecp fecpVar5 = v9.b;
                                                ((fjqm) fecpVar5).d = longExtra;
                                                if (!fecpVar5.L()) {
                                                    v9.U();
                                                }
                                                fjqm fjqmVar = (fjqm) v9.b;
                                                str9.getClass();
                                                fjqmVar.f = str9;
                                                fecj v10 = fjpq.a.v();
                                                if (!v10.b.L()) {
                                                    v10.U();
                                                }
                                                fecp fecpVar6 = v10.b;
                                                str10.getClass();
                                                ((fjpq) fecpVar6).b = str10;
                                                if (!fecpVar6.L()) {
                                                    v10.U();
                                                }
                                                fjpq fjpqVar = (fjpq) v10.b;
                                                str8.getClass();
                                                fjpqVar.c = str8;
                                                if (!v9.b.L()) {
                                                    v9.U();
                                                }
                                                fjqm fjqmVar2 = (fjqm) v9.b;
                                                fjpq fjpqVar2 = (fjpq) v10.Q();
                                                fjpqVar2.getClass();
                                                fjqmVar2.e = fjpqVar2;
                                                fjqmVar2.b |= 1;
                                                if (!fjquVar.b.L()) {
                                                    fjquVar.U();
                                                }
                                                fjqw fjqwVar3 = (fjqw) fjquVar.b;
                                                fjqm fjqmVar3 = (fjqm) v9.Q();
                                                fjqmVar3.getClass();
                                                fjqwVar3.i = fjqmVar3;
                                                fjqwVar3.b |= 4;
                                                fjmw d2 = aswq.d();
                                                fecj fecjVar2 = (fecj) d2.iB(5, null);
                                                fecjVar2.X(d2);
                                                fjmv fjmvVar = (fjmv) fecjVar2;
                                                fecj v11 = fjng.a.v();
                                                String a5 = atnbVar.a();
                                                if (!v11.b.L()) {
                                                    v11.U();
                                                }
                                                fjng fjngVar = (fjng) v11.b;
                                                a5.getClass();
                                                fjngVar.b = a5;
                                                if (!fjmvVar.b.L()) {
                                                    fjmvVar.U();
                                                }
                                                fjmw fjmwVar = (fjmw) fjmvVar.b;
                                                fjng fjngVar2 = (fjng) v11.Q();
                                                fjmw fjmwVar2 = fjmw.a;
                                                fjngVar2.getClass();
                                                fjmwVar.d = fjngVar2;
                                                fjmwVar.b |= 1;
                                                if (!fjquVar.b.L()) {
                                                    fjquVar.U();
                                                }
                                                fjqw fjqwVar4 = (fjqw) fjquVar.b;
                                                fjmw fjmwVar3 = (fjmw) fjmvVar.Q();
                                                fjmwVar3.getClass();
                                                fjqwVar4.j = fjmwVar3;
                                                fjqwVar4.b |= 8;
                                                ArrayList arrayList7 = arrayList6;
                                                arrayList7.add((fjqw) fjquVar.Q());
                                                arrayList6 = arrayList7;
                                                stringExtra8 = str9;
                                                stringExtra6 = str10;
                                                it3 = it4;
                                                arrayList4 = arrayList2;
                                                d = map;
                                                stringExtra7 = str8;
                                            }
                                            arrayList = arrayList6;
                                            atmcVar = atmcVar2;
                                        } catch (atmb e14) {
                                            e = e14;
                                            atmcVar = atmcVar2;
                                            eventManager = this;
                                            resultReceiver2 = resultReceiver3;
                                            str5 = str2;
                                            bundle = bundle2;
                                            bundle.putSerializable(str5, e);
                                            h(resultReceiver2, 0, bundle);
                                            eventManager.d(e, atmcVar);
                                            aswqVar.close();
                                        }
                                    }
                                    g = aswqVar.g(aswqVar.k(atmcVar, aswqVar.m(atmcVar, arrayList)));
                                } catch (atmb e15) {
                                    e = e15;
                                    bundle2 = bundle8;
                                }
                            } catch (atmb e16) {
                                e = e16;
                                bundle2 = bundle8;
                                eventManager = this;
                                resultReceiver2 = resultReceiver3;
                                bundle = bundle2;
                                bundle.putSerializable(str5, e);
                                h(resultReceiver2, 0, bundle);
                                eventManager.d(e, atmcVar);
                                aswqVar.close();
                            }
                        } catch (atmb e17) {
                            e = e17;
                            bundle2 = bundle8;
                            eventManager = this;
                            bundle = bundle2;
                            bundle.putSerializable(str5, e);
                            h(resultReceiver2, 0, bundle);
                            eventManager.d(e, atmcVar);
                            aswqVar.close();
                        }
                    } else {
                        str2 = str5;
                        resultReceiver3 = resultReceiver;
                        bundle2 = bundle8;
                        try {
                            if (intent.hasExtra("eventmanager.verify_phone_number_request_key")) {
                                VerifyPhoneNumberRequest verifyPhoneNumberRequest = (VerifyPhoneNumberRequest) intent.getParcelableExtra("eventmanager.verify_phone_number_request_key");
                                String stringExtra9 = intent.getStringExtra("eventmanager.calling_package_key");
                                aswqVar.n();
                                Context context2 = aswqVar.c;
                                List c6 = atmk.b(context2, atmcVar).c(atmcVar, context2);
                                List j3 = aswq.j(verifyPhoneNumberRequest.d);
                                if (!asxw.k(j3, "one_time_verification").equals("True") && !aswqVar.r(atmcVar, j3, verifyPhoneNumberRequest.a, stringExtra9)) {
                                    aswqVar.b.h("Device is not consented", new Object[0]);
                                    throw new atly();
                                }
                                List<fjqw> k = aswqVar.k(atmcVar, aswqVar.m(atmcVar, aswqVar.i(atmcVar, stringExtra9, verifyPhoneNumberRequest, c6)));
                                HashSet hashSet = new HashSet();
                                Iterator it5 = verifyPhoneNumberRequest.e.iterator();
                                while (it5.hasNext()) {
                                    hashSet.add(((ImsiRequest) it5.next()).a);
                                }
                                g = new HashMap();
                                g.put("UPI_FEATURES_ENABLED", new Bundle());
                                for (fjqw fjqwVar5 : k) {
                                    if (hashSet.isEmpty()) {
                                        fjqx fjqxVar3 = fjqwVar5.e;
                                        if (fjqxVar3 == null) {
                                            fjqxVar3 = fjqx.a;
                                        }
                                        fjqg fjqgVar2 = (fjqxVar3.b == 1 ? (fjqe) fjqxVar3.c : fjqe.a).c;
                                        if (fjqgVar2 == null) {
                                            fjqgVar2 = fjqg.a;
                                        }
                                        str3 = (String) fjqgVar2.b.get(0);
                                    } else {
                                        str3 = null;
                                    }
                                    if (str3 == null) {
                                        fjqx fjqxVar4 = fjqwVar5.e;
                                        if (fjqxVar4 == null) {
                                            fjqxVar4 = fjqx.a;
                                        }
                                        fjqg fjqgVar3 = (fjqxVar4.b == 1 ? (fjqe) fjqxVar4.c : fjqe.a).c;
                                        if (fjqgVar3 == null) {
                                            fjqgVar3 = fjqg.a;
                                        }
                                        Iterator it6 = fjqgVar3.b.iterator();
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
                                        aswqVar.b.h("Verification for %s was not returned", null);
                                    } else {
                                        Bundle a6 = aswqVar.a(fjqwVar5);
                                        atmf.e();
                                        if (atmf.d(fjqwVar5)) {
                                            a6.putString("phone_number", (fjqwVar5.c == 3 ? (fjqy) fjqwVar5.d : fjqy.a).c);
                                            a6.putInt("result", 1);
                                            i2 = i;
                                        } else {
                                            atmf.e();
                                            if (atmf.c(fjqwVar5)) {
                                                a6.putInt("result", 6);
                                                i2 = i;
                                                fjms fjmsVar = (fjqwVar5.c == i2 ? (fjpw) fjqwVar5.d : fjpw.a).c;
                                                if (fjmsVar == null) {
                                                    fjmsVar = fjms.a;
                                                }
                                                fjmu b8 = fjmu.b(fjmsVar.f);
                                                if (b8 == null) {
                                                    b8 = fjmu.UNRECOGNIZED;
                                                }
                                                a6.putInt("verification_method", b8.a());
                                            } else {
                                                i2 = i;
                                                atmf.e();
                                                if (fjqwVar5 != null && !atme.b(atmf.a(fjqwVar5)) && (b = fjqv.b(fjqwVar5.f)) != 0 && b == 3) {
                                                    EnumMap enumMap = aswq.a;
                                                    switch ((fjqwVar5.c == 9 ? (fjqt) fjqwVar5.d : fjqt.a).b) {
                                                        case 0:
                                                            fjqsVar = fjqs.UNKNOWN_REASON;
                                                            break;
                                                        case 1:
                                                            fjqsVar = fjqs.THROTTLED;
                                                            break;
                                                        case 2:
                                                            fjqsVar = fjqs.FAILED;
                                                            break;
                                                        case 3:
                                                            fjqsVar = fjqs.SKIPPED;
                                                            break;
                                                        case 4:
                                                            fjqsVar = fjqs.NOT_REQUIRED;
                                                            break;
                                                        case 5:
                                                            fjqsVar = fjqs.PHONE_NUMBER_ENTRY_REQUIRED;
                                                            break;
                                                        case 6:
                                                            fjqsVar = fjqs.INELIGIBLE;
                                                            break;
                                                        default:
                                                            fjqsVar = null;
                                                            break;
                                                    }
                                                    if (fjqsVar == null) {
                                                        fjqsVar = fjqs.UNRECOGNIZED;
                                                    }
                                                    a6.putInt("result", ((Integer) enumMap.get(fjqsVar)).intValue());
                                                    fjmu b9 = fjmu.b((fjqwVar5.c == 9 ? (fjqt) fjqwVar5.d : fjqt.a).d);
                                                    if (b9 == null) {
                                                        b9 = fjmu.UNRECOGNIZED;
                                                    }
                                                    a6.putInt("verification_method", b9.a());
                                                    fjrh fjrhVar = (fjqwVar5.c == 9 ? (fjqt) fjqwVar5.d : fjqt.a).c;
                                                    if (fjrhVar == null) {
                                                        fjrhVar = fjrh.a;
                                                    }
                                                    a6.putLong("retry_after", atlk.b(fjrhVar));
                                                }
                                                a6.putInt("result", 0);
                                            }
                                        }
                                        g.put(str3, a6);
                                        i = i2;
                                    }
                                }
                            } else if (intExtra == 7) {
                                aswqVar.n();
                                Context context3 = aswqVar.c;
                                List c7 = atmk.b(context3, atmcVar).c(atmcVar, context3);
                                List j4 = aswq.j(bundleExtra);
                                if (!asxw.k(j4, "one_time_verification").equals("True")) {
                                    aswqVar.o(atmcVar);
                                    aswqVar.f.a();
                                    fjmp fjmpVar = fjmp.UNKNOWN_CLIENT;
                                    asxw asxwVar4 = aswqVar.d;
                                    fjpl c8 = asxwVar4.c(atmcVar, fjmpVar);
                                    if (!j4.isEmpty()) {
                                        c8.a(j4);
                                    }
                                    if (!(fmmf.a.a().p() ? asxw.s(asxwVar4.d(atmcVar, c8), fjmpVar) : asxwVar4.q(atmcVar, c8, fjmpVar))) {
                                        aswqVar.b.h("Device is not consented", new Object[0]);
                                        throw new atly();
                                    }
                                }
                                g = aswqVar.g(aswqVar.k(atmcVar, aswqVar.m(atmcVar, aswqVar.h(atmcVar, j4, c7))));
                            } else {
                                aswqVar.n();
                                Context context4 = aswqVar.c;
                                g = aswqVar.g(aswqVar.l(atmcVar, bundleExtra, atmk.b(context4, atmcVar).c(atmcVar, context4)));
                            }
                        } catch (atmb e18) {
                            e = e18;
                            eventManager = this;
                            resultReceiver2 = resultReceiver3;
                            bundle = bundle2;
                            str5 = str2;
                            bundle.putSerializable(str5, e);
                            h(resultReceiver2, 0, bundle);
                            eventManager.d(e, atmcVar);
                            aswqVar.close();
                        }
                    }
                    bundle = bundle2;
                } catch (atmb e19) {
                    e = e19;
                }
                try {
                    bundle.putSerializable("success_server_result_data_key", g);
                    resultReceiver2 = resultReceiver3;
                    try {
                        h(resultReceiver2, 1, bundle);
                        eventManager = this;
                    } catch (atmb e20) {
                        e = e20;
                        eventManager = this;
                    }
                    try {
                        eventManager.e(atmcVar);
                    } catch (atmb e21) {
                        e = e21;
                        str5 = str2;
                        bundle.putSerializable(str5, e);
                        h(resultReceiver2, 0, bundle);
                        eventManager.d(e, atmcVar);
                        aswqVar.close();
                    }
                } catch (atmb e22) {
                    e = e22;
                    eventManager = this;
                    resultReceiver2 = resultReceiver3;
                    str5 = str2;
                    bundle.putSerializable(str5, e);
                    h(resultReceiver2, 0, bundle);
                    eventManager.d(e, atmcVar);
                    aswqVar.close();
                }
            } catch (Throwable th4) {
                th = th4;
            }
            aswqVar.close();
        }
    }
}
