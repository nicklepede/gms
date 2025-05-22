package com.google.android.gms.statementservice;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.verify.domain.DomainVerificationInfo;
import android.content.pm.verify.domain.DomainVerificationRequest;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.statementservice.database.VerificationRequestParamsDatabase;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dhae;
import defpackage.dham;
import defpackage.dhan;
import defpackage.dhao;
import defpackage.dhap;
import defpackage.dhar;
import defpackage.dhat;
import defpackage.dhau;
import defpackage.elkk;
import defpackage.eluo;
import defpackage.fvca;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class DomainVerificationIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("AppLinksIntentOperation", auid.STATEMENT_SERVICE);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ArrayList<String> arrayList;
        DomainVerificationInfo domainVerificationInfo;
        String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.DOMAINS_NEED_VERIFICATION")) {
            Context applicationContext = getApplicationContext();
            if (!fvca.c()) {
                ((eluo) a.j()).x("SC+ verification of app links not yet enabled");
                return;
            }
            ((eluo) a.h()).x("Verifying requested domains");
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("android.content.pm.verify.domain.extra.VERIFICATION_REQUEST")) {
                arrayList = new ArrayList();
            } else {
                DomainVerificationRequest parcelable = extras.getParcelable("android.content.pm.verify.domain.extra.VERIFICATION_REQUEST");
                arrayList = (parcelable == null || parcelable.getPackageNames() == null) ? new ArrayList() : new ArrayList(parcelable.getPackageNames());
            }
            dhao dhaoVar = new dhao(applicationContext);
            ausn ausnVar = dhap.a;
            ArrayList<dhat> arrayList2 = new ArrayList();
            for (String str : arrayList) {
                try {
                    domainVerificationInfo = dhaoVar.a.getDomainVerificationInfo(str);
                    if (domainVerificationInfo == null) {
                        ((eluo) dhap.a.i()).B("DomainVerificationInfo is null for %s", str);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((eluo) ((eluo) dhap.a.i()).s(e)).B("Cannot find package %s", str);
                    domainVerificationInfo = null;
                }
                if (domainVerificationInfo != null) {
                    Map hostToStateMap = domainVerificationInfo.getHostToStateMap();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : hostToStateMap.entrySet()) {
                        if (entry.getValue() == null) {
                            ((eluo) dhap.a.j()).B("State is null for host %s", entry.getKey());
                        } else {
                            int intValue = ((Integer) entry.getValue()).intValue();
                            if (intValue != 0) {
                                if (intValue != 1 && intValue != 2) {
                                    if (intValue != 3 && intValue != 4 && intValue != 1024) {
                                        ((eluo) dhap.a.j()).z("Unhandled state in hostToStateMap %s", intValue);
                                    }
                                }
                            }
                            arrayList3.add((String) entry.getKey());
                        }
                    }
                    List f = elkk.f(arrayList3, (int) fvca.a.lK().a());
                    UUID identifier = domainVerificationInfo.getIdentifier();
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new dhat(str, identifier, (List) it.next(), 0));
                    }
                }
            }
            ausn ausnVar2 = dham.a;
            Context applicationContext2 = getApplicationContext();
            dhau v = VerificationRequestParamsDatabase.w(applicationContext2).v();
            dhae dhaeVar = new dhae(applicationContext2);
            dhao dhaoVar2 = new dhao(applicationContext2);
            ((eluo) dham.a.h()).z("Processing %d input requests", arrayList2.size());
            for (dhat dhatVar : arrayList2) {
                v.b(dhatVar);
                dham.b(dhatVar, dhaeVar, v, dhaoVar2);
            }
            if (fvca.d()) {
                ausn ausnVar3 = dhan.a;
                if (fvca.d()) {
                    if (!fvca.d()) {
                        ((eluo) dhan.a.h()).z("Skipping %d input requests (flag disabled)", arrayList2.size());
                        return;
                    }
                    ((eluo) dhan.a.h()).z("Processing %d input requests", arrayList2.size());
                    ArrayList arrayList4 = new ArrayList();
                    for (dhat dhatVar2 : arrayList2) {
                        String str2 = dhatVar2.b;
                        try {
                        } catch (PackageManager.NameNotFoundException e2) {
                            ((eluo) ((eluo) dhan.a.i()).s(e2)).B("Could not find package to verify: %s", e2.getMessage());
                        }
                        if (dhar.f(str2, applicationContext).contains("F9:A8:F7:5A:7F:0B:5D:2C:CA:E8:C2:B5:70:85:56:40:E7:09:99:55:58:CD:97:06:AF:74:B8:4E:68:96:2F:AA")) {
                            int a2 = dham.a(dhatVar2.c, new HashSet(dhatVar2.d), 1, dhatVar2.b, dhaoVar);
                            if (a2 == -1) {
                                ((eluo) dhan.a.j()).B("No hosts specified for %s", str2);
                            } else if (a2 != 0) {
                                ((eluo) dhan.a.i()).x("Failed to notify DomainManager");
                                if (a2 != 0) {
                                }
                            }
                        }
                        arrayList4.add(dhatVar2);
                    }
                    ((eluo) dhan.a.h()).z("Returning %d non-WebAPK requests", arrayList4.size());
                }
            }
        }
    }
}
