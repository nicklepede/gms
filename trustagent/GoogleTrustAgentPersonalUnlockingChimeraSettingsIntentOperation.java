package com.google.android.gms.trustagent;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import com.google.android.gms.trustagent.common.ui.ConfirmUserCredentialAndStartChimeraActivity;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.atad;
import defpackage.auiq;
import defpackage.ausk;
import defpackage.ausn;
import defpackage.auto;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.djap;
import defpackage.djar;
import defpackage.ekvh;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.elpg;
import defpackage.eluo;
import j$.lang.Iterable$EL;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentPersonalUnlockingChimeraSettingsIntentOperation extends apzq {
    static final ausk a = new ausk() { // from class: divz
        @Override // defpackage.ausk
        public final Object a(Object obj) {
            aszs aszsVar = diwh.a;
            return new atad((Context) obj, (char[]) null);
        }
    };

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.apzq
    public final List c() {
        Optional of;
        Optional empty;
        Bundle bundle;
        final ArrayList arrayList = new ArrayList();
        Context applicationContext = getApplicationContext();
        if (auto.a(applicationContext).j()) {
            of = Optional.empty();
        } else {
            KeyguardManager keyguardManager = (KeyguardManager) applicationContext.getSystemService("keyguard");
            if (keyguardManager == null || !keyguardManager.isDeviceSecure()) {
                GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent(), -1, getString(R.string.personal_unlock_component_name), aqlc.TRUST_AGENT_ITEM, auiq.DEFAULT_TRUSTAGENT);
                googleSettingsItem.j = false;
                googleSettingsItem.i = false;
                googleSettingsItem.p = getString(R.string.disabled_because_no_backup_security);
                of = Optional.of(googleSettingsItem);
            } else {
                GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(ConfirmUserCredentialAndStartChimeraActivity.b(applicationContext, new Intent().setClassName(applicationContext, "com.google.android.gms.trustagent.GoogleTrustAgentPersonalUnlockingSettings"), null), -1, getString(R.string.personal_unlock_component_name), aqlc.TRUST_AGENT_ITEM, auiq.DEFAULT_TRUSTAGENT);
                googleSettingsItem2.j = false;
                googleSettingsItem2.p = getString(R.string.auth_google_smart_lock_intro);
                of = Optional.of(googleSettingsItem2);
            }
        }
        Objects.requireNonNull(arrayList);
        of.ifPresent(new Consumer() { // from class: diwa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void u(Object obj) {
                arrayList.add((GoogleSettingsItem) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ausn ausnVar = djar.a;
        ausk auskVar = a;
        final ArrayList arrayList2 = new ArrayList();
        dhlw aD = ((atad) auskVar.a(this)).aD(4, new Bundle());
        Bundle bundle2 = new Bundle();
        try {
            bundle2 = (Bundle) dhmr.n(aD);
        } catch (InterruptedException | ExecutionException e) {
            ((eluo) ((eluo) djar.a.j()).s(e)).x("Could not get Trustagent trustlet config.");
        }
        ArrayList<djap> arrayList3 = new ArrayList();
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("key_trustlet_names");
        int i = elgo.d;
        for (String str : (List) ekvh.c(stringArrayList, elpg.a)) {
            if (!str.equals("Place") && (bundle = bundle2.getBundle(str)) != null) {
                arrayList3.add(new djap(this, str, bundle));
            }
        }
        for (djap djapVar : arrayList3) {
            Bundle bundle3 = djapVar.e;
            if (bundle3.getBoolean("key_trustlet_is_suppored") && bundle3.getBoolean("key_trustlet_has_required_permissions")) {
                String str2 = djapVar.d;
                elgx elgxVar = djap.b;
                if (elgxVar.containsKey(str2)) {
                    elgx elgxVar2 = djap.a;
                    if (elgxVar2.containsKey(str2)) {
                        Intent intent = new Intent("android.intent.action.MAIN");
                        Context context = djapVar.c;
                        Intent className = intent.setClassName(context, "com.google.android.gms.trustagent.TrustAgentSearchEntryPointActivity");
                        aqlc aqlcVar = (aqlc) elgxVar2.get(str2);
                        auiq auiqVar = (auiq) elgxVar.get(str2);
                        if (aqlcVar == null || auiqVar == null) {
                            empty = Optional.empty();
                        } else {
                            KeyguardManager keyguardManager2 = djapVar.f;
                            boolean z = keyguardManager2 != null && keyguardManager2.isDeviceSecure();
                            final GoogleSettingsItem googleSettingsItem3 = new GoogleSettingsItem(className, -1, bundle3.getString("key_trustlet_pref_title"), aqlcVar, auiqVar);
                            googleSettingsItem3.h = context.getString(R.string.personal_unlock_preference_name);
                            googleSettingsItem3.q = context.getString(R.string.personal_unlock_preference_name);
                            googleSettingsItem3.i = z;
                            googleSettingsItem3.j = true;
                            googleSettingsItem3.l = true;
                            googleSettingsItem3.m = "trustagent_search_".concat(String.valueOf(str2));
                            HashSet hashSet = new HashSet();
                            String string = context.getString(R.string.personal_unlock_preference_name);
                            String string2 = context.getString(R.string.auth_google_trust_agent_title);
                            BreakIterator wordInstance = BreakIterator.getWordInstance();
                            djapVar.a(hashSet, wordInstance, string);
                            djapVar.a(hashSet, wordInstance, string2);
                            Objects.requireNonNull(googleSettingsItem3);
                            Iterable$EL.forEach(hashSet, new Consumer() { // from class: djao
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void u(Object obj) {
                                    GoogleSettingsItem.this.a((String) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            empty = Optional.of(googleSettingsItem3);
                        }
                        Objects.requireNonNull(arrayList2);
                        empty.ifPresent(new Consumer() { // from class: djaq
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void u(Object obj) {
                                arrayList2.add((GoogleSettingsItem) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
