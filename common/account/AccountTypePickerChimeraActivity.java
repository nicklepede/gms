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
import defpackage.asyf;
import defpackage.asyg;
import defpackage.asyh;
import defpackage.aszc;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsup;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.ryt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AccountTypePickerChimeraActivity extends ryt {
    private static final ausn k = ausn.b("AccountChooser", auid.COMMON_ACCOUNT);
    public ArrayList j;
    private final HashMap l = new HashMap();

    public static Intent a(Context context, aszc aszcVar) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.common.account.AccountTypePickerActivity");
        intent.setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        elgo elgoVar = aszcVar.a;
        intent.putExtra("allowableAccountTypes", elgoVar == null ? null : (String[]) elgoVar.toArray(new String[((elpg) elgoVar).c]));
        return intent;
    }

    private final void c() {
        Resources.NotFoundException notFoundException;
        String str;
        PackageManager.NameNotFoundException nameNotFoundException;
        Drawable drawable;
        String str2;
        Context createPackageContext;
        for (AuthenticatorDescription authenticatorDescription : bsup.b(this).r()) {
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
                ausn ausnVar = k;
                if (((eluo) ausnVar.j()).ab()) {
                    ((eluo) ((eluo) ((eluo) ausnVar.j()).s(nameNotFoundException)).ai(3124)).B("No icon name for account type %s", authenticatorDescription.type);
                }
                drawable = drawable2;
                str2 = str;
                this.l.put(authenticatorDescription.type, new asyh(authenticatorDescription, str2, drawable));
            } catch (Resources.NotFoundException e4) {
                str = null;
                drawable2 = drawable;
                notFoundException = e4;
                ausn ausnVar2 = k;
                if (((eluo) ausnVar2.j()).ab()) {
                    ((eluo) ((eluo) ((eluo) ausnVar2.j()).s(notFoundException)).ai(3125)).B("No icon resource for account type %s", authenticatorDescription.type);
                }
                drawable = drawable2;
                str2 = str;
                this.l.put(authenticatorDescription.type, new asyh(authenticatorDescription, str2, drawable));
            }
            this.l.put(authenticatorDescription.type, new asyh(authenticatorDescription, str2, drawable));
        }
    }

    public final void b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("accountType", str);
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
            asyh asyhVar = (asyh) entry.getValue();
            if (hashSet == null || hashSet.contains(str2)) {
                this.j.add(asyhVar);
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
            b(((asyh) this.j.get(0)).a.type);
            return;
        }
        setContentView(R.layout.common_account_type_picker);
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter((ListAdapter) new asyg(this, this.j));
        listView.setChoiceMode(0);
        listView.setTextFilterEnabled(false);
        listView.setOnItemClickListener(new asyf(this));
    }
}
