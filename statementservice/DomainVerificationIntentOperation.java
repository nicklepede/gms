package com.google.android.gms.statementservice;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.verify.domain.DomainVerificationInfo;
import android.content.pm.verify.domain.DomainVerificationRequest;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.statementservice.database.VerificationRequestParamsDatabase;
import defpackage.asej;
import defpackage.asot;
import defpackage.depb;
import defpackage.depj;
import defpackage.depk;
import defpackage.depl;
import defpackage.depm;
import defpackage.depo;
import defpackage.depq;
import defpackage.depr;
import defpackage.eixf;
import defpackage.ejhf;
import defpackage.fshc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class DomainVerificationIntentOperation extends IntentOperation {
    private static final asot a = asot.b("AppLinksIntentOperation", asej.STATEMENT_SERVICE);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ArrayList<String> arrayList;
        DomainVerificationInfo domainVerificationInfo;
        String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.DOMAINS_NEED_VERIFICATION")) {
            Context applicationContext = getApplicationContext();
            if (!fshc.c()) {
                ((ejhf) a.j()).x("SC+ verification of app links not yet enabled");
                return;
            }
            ((ejhf) a.h()).x("Verifying requested domains");
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("android.content.pm.verify.domain.extra.VERIFICATION_REQUEST")) {
                arrayList = new ArrayList();
            } else {
                DomainVerificationRequest parcelable = extras.getParcelable("android.content.pm.verify.domain.extra.VERIFICATION_REQUEST");
                arrayList = (parcelable == null || parcelable.getPackageNames() == null) ? new ArrayList() : new ArrayList(parcelable.getPackageNames());
            }
            depl deplVar = new depl(applicationContext);
            asot asotVar = depm.a;
            ArrayList<depq> arrayList2 = new ArrayList();
            for (String str : arrayList) {
                try {
                    domainVerificationInfo = deplVar.a.getDomainVerificationInfo(str);
                    if (domainVerificationInfo == null) {
                        ((ejhf) depm.a.i()).B("DomainVerificationInfo is null for %s", str);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((ejhf) ((ejhf) depm.a.i()).s(e)).B("Cannot find package %s", str);
                    domainVerificationInfo = null;
                }
                if (domainVerificationInfo != null) {
                    Map hostToStateMap = domainVerificationInfo.getHostToStateMap();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : hostToStateMap.entrySet()) {
                        if (entry.getValue() == null) {
                            ((ejhf) depm.a.j()).B("State is null for host %s", entry.getKey());
                        } else {
                            int intValue = ((Integer) entry.getValue()).intValue();
                            if (intValue != 0) {
                                if (intValue != 1 && intValue != 2) {
                                    if (intValue != 3 && intValue != 4 && intValue != 1024) {
                                        ((ejhf) depm.a.j()).z("Unhandled state in hostToStateMap %s", intValue);
                                    }
                                }
                            }
                            arrayList3.add((String) entry.getKey());
                        }
                    }
                    List f = eixf.f(arrayList3, (int) fshc.a.a().a());
                    UUID identifier = domainVerificationInfo.getIdentifier();
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new depq(str, identifier, (List) it.next(), 0));
                    }
                }
            }
            asot asotVar2 = depj.a;
            Context applicationContext2 = getApplicationContext();
            depr v = VerificationRequestParamsDatabase.w(applicationContext2).v();
            depb depbVar = new depb(applicationContext2);
            depl deplVar2 = new depl(applicationContext2);
            ((ejhf) depj.a.h()).z("Processing %d input requests", arrayList2.size());
            for (depq depqVar : arrayList2) {
                v.b(depqVar);
                depj.b(depqVar, depbVar, v, deplVar2);
            }
            if (fshc.d()) {
                asot asotVar3 = depk.a;
                if (fshc.d()) {
                    if (!fshc.d()) {
                        ((ejhf) depk.a.h()).z("Skipping %d input requests (flag disabled)", arrayList2.size());
                        return;
                    }
                    ((ejhf) depk.a.h()).z("Processing %d input requests", arrayList2.size());
                    ArrayList arrayList4 = new ArrayList();
                    for (depq depqVar2 : arrayList2) {
                        String str2 = depqVar2.b;
                        try {
                        } catch (PackageManager.NameNotFoundException e2) {
                            ((ejhf) ((ejhf) depk.a.i()).s(e2)).B("Could not find package to verify: %s", e2.getMessage());
                        }
                        if (depo.f(str2, applicationContext).contains("F9:A8:F7:5A:7F:0B:5D:2C:CA:E8:C2:B5:70:85:56:40:E7:09:99:55:58:CD:97:06:AF:74:B8:4E:68:96:2F:AA")) {
                            int a2 = depj.a(depqVar2.c, new HashSet(depqVar2.d), 1, depqVar2.b, deplVar);
                            if (a2 == -1) {
                                ((ejhf) depk.a.j()).B("No hosts specified for %s", str2);
                            } else if (a2 != 0) {
                                ((ejhf) depk.a.i()).x("Failed to notify DomainManager");
                                if (a2 != 0) {
                                }
                            }
                        }
                        arrayList4.add(depqVar2);
                    }
                    ((ejhf) depk.a.h()).z("Returning %d non-WebAPK requests", arrayList4.size());
                }
            }
        }
    }
}
