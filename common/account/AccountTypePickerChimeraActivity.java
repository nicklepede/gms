package com.google.android.gms.common.account;

import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aqvq;
import defpackage.aqvr;
import defpackage.aqvs;
import defpackage.aqwn;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqna;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.qfp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AccountTypePickerChimeraActivity extends qfp {
    private static final asot k = asot.b("AccountChooser", asej.COMMON_ACCOUNT);
    public ArrayList j;
    private final HashMap l = new HashMap();

    public static Intent a(Context context, aqwn aqwnVar) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.common.account.AccountTypePickerActivity");
        intent.setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        eitj eitjVar = aqwnVar.a;
        intent.putExtra("allowableAccountTypes", eitjVar == null ? null : (String[]) eitjVar.toArray(new String[((ejcb) eitjVar).c]));
        return intent;
    }

    private final void c() {
        Resources.NotFoundException notFoundException;
        String str;
        PackageManager.NameNotFoundException nameNotFoundException;
        Drawable drawable;
        String str2;
        Context createPackageContext;
        for (AuthenticatorDescription authenticatorDescription : bqna.b(this).r()) {
            Drawable drawable2 = null;
            try {
                createPackageContext = createPackageContext(authenticatorDescription.packageName, 0);
                drawable = createPackageContext.getResources().getDrawable(authenticatorDescription.iconId);
            } catch (PackageManager.NameNotFoundException e) {
                nameNotFoundException = e;
                str = null;
            } catch (Resources.NotFoundException e2) {
                notFoundException = e2;
                str = null;
            }
            try {
                CharSequence text = createPackageContext.getResources().getText(authenticatorDescription.labelId);
                if (text != null) {
                    text.toString();
                }
                str2 = text.toString();
            } catch (PackageManager.NameNotFoundException e3) {
                str = null;
                drawable2 = drawable;
                nameNotFoundException = e3;
                asot asotVar = k;
                if (((ejhf) asotVar.j()).ab()) {
                    ((ejhf) ((ejhf) ((ejhf) asotVar.j()).s(nameNotFoundException)).ah(3120)).B("No icon name for account type %s", authenticatorDescription.type);
                }
                drawable = drawable2;
                str2 = str;
                this.l.put(authenticatorDescription.type, new aqvs(authenticatorDescription, str2, drawable));
            } catch (Resources.NotFoundException e4) {
                str = null;
                drawable2 = drawable;
                notFoundException = e4;
                asot asotVar2 = k;
                if (((ejhf) asotVar2.j()).ab()) {
                    ((ejhf) ((ejhf) ((ejhf) asotVar2.j()).s(notFoundException)).ah(3121)).B("No icon resource for account type %s", authenticatorDescription.type);
                }
                drawable = drawable2;
                str2 = str;
                this.l.put(authenticatorDescription.type, new aqvs(authenticatorDescription, str2, drawable));
            }
            this.l.put(authenticatorDescription.type, new aqvs(authenticatorDescription, str2, drawable));
        }
    }

    public final void b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("accountType", str);
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        HashSet hashSet;
        super.onCreate(bundle);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("allowableAccountTypes");
        if (stringArrayExtra != null) {
            hashSet = new HashSet(stringArrayExtra.length);
            for (String str : stringArrayExtra) {
                hashSet.add(str);
            }
        } else {
            hashSet = null;
        }
        c();
        HashMap hashMap = this.l;
        this.j = new ArrayList(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            aqvs aqvsVar = (aqvs) entry.getValue();
            if (hashSet == null || hashSet.contains(str2)) {
                this.j.add(aqvsVar);
            }
        }
        if (this.j.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("errorMessage", "no allowable account types");
            setResult(-1, new Intent().putExtras(bundle2));
            finish();
            return;
        }
        if (this.j.size() == 1) {
            b(((aqvs) this.j.get(0)).a.type);
            return;
        }
        setContentView(R.layout.common_account_type_picker);
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter((ListAdapter) new aqvr(this, this.j));
        listView.setChoiceMode(0);
        listView.setTextFilterEnabled(false);
        listView.setOnItemClickListener(new aqvq(this));
    }
}
