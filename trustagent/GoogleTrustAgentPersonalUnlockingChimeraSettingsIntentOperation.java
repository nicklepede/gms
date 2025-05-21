package com.google.android.gms.trustagent;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import com.google.android.gms.trustagent.common.ui.ConfirmUserCredentialAndStartChimeraActivity;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.aqxo;
import defpackage.asew;
import defpackage.asoq;
import defpackage.asot;
import defpackage.aspu;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dgpk;
import defpackage.dgpm;
import defpackage.eiic;
import defpackage.eitj;
import defpackage.eits;
import defpackage.ejcb;
import defpackage.ejhf;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentPersonalUnlockingChimeraSettingsIntentOperation extends anxy {
    static final asoq a = new asoq() { // from class: dgku
        @Override // defpackage.asoq
        public final Object a(Object obj) {
            aqxd aqxdVar = dglc.a;
            return new aqxo((Context) obj, (char[]) null);
        }
    };

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.anxy
    public final List c() {
        Optional of;
        Optional empty;
        Bundle bundle;
        final ArrayList arrayList = new ArrayList();
        Context applicationContext = getApplicationContext();
        if (aspu.a(applicationContext).j()) {
            of = Optional.empty();
        } else {
            KeyguardManager keyguardManager = (KeyguardManager) applicationContext.getSystemService("keyguard");
            if (keyguardManager == null || !keyguardManager.isDeviceSecure()) {
                GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent(), -1, getString(R.string.personal_unlock_component_name), aojj.TRUST_AGENT_ITEM, asew.DEFAULT_TRUSTAGENT);
                googleSettingsItem.j = false;
                googleSettingsItem.i = false;
                googleSettingsItem.p = getString(R.string.disabled_because_no_backup_security);
                of = Optional.of(googleSettingsItem);
            } else {
                GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(ConfirmUserCredentialAndStartChimeraActivity.b(applicationContext, new Intent().setClassName(applicationContext, "com.google.android.gms.trustagent.GoogleTrustAgentPersonalUnlockingSettings"), null), -1, getString(R.string.personal_unlock_component_name), aojj.TRUST_AGENT_ITEM, asew.DEFAULT_TRUSTAGENT);
                googleSettingsItem2.j = false;
                googleSettingsItem2.p = getString(R.string.auth_google_smart_lock_intro);
                of = Optional.of(googleSettingsItem2);
            }
        }
        Objects.requireNonNull(arrayList);
        of.ifPresent(new Consumer() { // from class: dgkv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void q(Object obj) {
                arrayList.add((GoogleSettingsItem) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        asot asotVar = dgpm.a;
        asoq asoqVar = a;
        final ArrayList arrayList2 = new ArrayList();
        dfaq aE = ((aqxo) asoqVar.a(this)).aE(4, new Bundle());
        Bundle bundle2 = new Bundle();
        try {
            bundle2 = (Bundle) dfbl.n(aE);
        } catch (InterruptedException | ExecutionException e) {
            ((ejhf) ((ejhf) dgpm.a.j()).s(e)).x("Could not get Trustagent trustlet config.");
        }
        ArrayList<dgpk> arrayList3 = new ArrayList();
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("key_trustlet_names");
        int i = eitj.d;
        for (String str : (List) eiic.c(stringArrayList, ejcb.a)) {
            if (!str.equals("Place") && (bundle = bundle2.getBundle(str)) != null) {
                arrayList3.add(new dgpk(this, str, bundle));
            }
        }
        for (dgpk dgpkVar : arrayList3) {
            Bundle bundle3 = dgpkVar.e;
            if (bundle3.getBoolean("key_trustlet_is_suppored") && bundle3.getBoolean("key_trustlet_has_required_permissions")) {
                String str2 = dgpkVar.d;
                eits eitsVar = dgpk.b;
                if (eitsVar.containsKey(str2)) {
                    eits eitsVar2 = dgpk.a;
                    if (eitsVar2.containsKey(str2)) {
                        Intent intent = new Intent("android.intent.action.MAIN");
                        Context context = dgpkVar.c;
                        Intent className = intent.setClassName(context, "com.google.android.gms.trustagent.TrustAgentSearchEntryPointActivity");
                        aojj aojjVar = (aojj) eitsVar2.get(str2);
                        asew asewVar = (asew) eitsVar.get(str2);
                        if (aojjVar == null || asewVar == null) {
                            empty = Optional.empty();
                        } else {
                            KeyguardManager keyguardManager2 = dgpkVar.f;
                            boolean z = keyguardManager2 != null && keyguardManager2.isDeviceSecure();
                            final GoogleSettingsItem googleSettingsItem3 = new GoogleSettingsItem(className, -1, bundle3.getString("key_trustlet_pref_title"), aojjVar, asewVar);
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
                            dgpkVar.a(hashSet, wordInstance, string);
                            dgpkVar.a(hashSet, wordInstance, string2);
                            Objects.requireNonNull(googleSettingsItem3);
                            Iterable$EL.forEach(hashSet, new Consumer() { // from class: dgpj
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void q(Object obj) {
                                    GoogleSettingsItem.this.a((String) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            empty = Optional.of(googleSettingsItem3);
                        }
                        Objects.requireNonNull(arrayList2);
                        empty.ifPresent(new Consumer() { // from class: dgpl
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void q(Object obj) {
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
