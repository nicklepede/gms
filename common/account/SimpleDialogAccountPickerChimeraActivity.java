package com.google.android.gms.common.account;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;
import defpackage.aszc;
import defpackage.aszd;
import defpackage.auad;
import defpackage.boim;
import defpackage.boio;
import defpackage.fuwn;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SimpleDialogAccountPickerChimeraActivity extends rxx {
    public static final auad j = new auad("CommonAccount", "SimpleAccountPicker");
    public String k;
    public String l;
    public aszc m;
    public boio n;
    public ListView o;
    public int p = -1;

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.n.e(i, i2, intent);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        Intent intent2 = null;
        if (intent != null) {
            Intent a = aszd.a(intent, this, false);
            if (a != null) {
                aszc aszcVar = new aszc(a, 3);
                this.m = aszcVar;
                setTheme(aszcVar.i);
                setTitle((CharSequence) null);
            }
            intent2 = a;
        }
        super.onCreate(bundle);
        if (intent == null) {
            j.f("This activity cannot be called without an intent, finishing early", new Object[0]);
            finish();
            return;
        }
        if (intent2 == null) {
            j.f("Caller package name could not be determined, finishing early", new Object[0]);
            finish();
            return;
        }
        if (bundle != null) {
            this.p = bundle.getInt("key-selected-item", -1);
        }
        this.l = this.m.h;
        this.k = aszd.b(getApplication(), this.l);
        boim boimVar = new boim(getApplicationContext(), this.l, fuwn.d());
        aszc aszcVar2 = this.m;
        boimVar.g = aszcVar2.d;
        boimVar.d(aszcVar2.a);
        aszc aszcVar3 = this.m;
        boimVar.b = aszcVar3.b;
        boimVar.f = aszcVar3.m;
        getApplicationContext();
        boimVar.h = false;
        boimVar.e = this.m.l;
        boio boioVar = (boio) new jxw(this, boimVar).a(boio.class);
        this.n = boioVar;
        boioVar.e.g(this, new jvs() { // from class: asyo
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Bundle extras;
                String string;
                boin boinVar = (boin) obj;
                if (boinVar == null) {
                    return;
                }
                SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = SimpleDialogAccountPickerChimeraActivity.this;
                int i = boinVar.a;
                Intent intent3 = boinVar.b;
                if (i == 10) {
                    Toast.makeText(simpleDialogAccountPickerChimeraActivity, R.string.common_account_restricted_no_accounts, 0).show();
                    i = 0;
                } else if (i == -1 && intent3 != null && simpleDialogAccountPickerChimeraActivity.m.c && (extras = intent3.getExtras()) != null && (string = extras.getString("authAccount")) != null) {
                    atxi.d(simpleDialogAccountPickerChimeraActivity, string, simpleDialogAccountPickerChimeraActivity.l);
                }
                if (intent3 == null) {
                    simpleDialogAccountPickerChimeraActivity.setResult(i);
                } else {
                    simpleDialogAccountPickerChimeraActivity.setResult(i, intent3);
                }
                simpleDialogAccountPickerChimeraActivity.finish();
            }
        });
        this.n.f.g(this, new jvs() { // from class: asyp
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Intent intent3;
                boin boinVar = (boin) obj;
                if (boinVar == null) {
                    return;
                }
                SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = SimpleDialogAccountPickerChimeraActivity.this;
                int i = boinVar.a;
                if (i == 1) {
                    intent3 = AccountTypePickerChimeraActivity.a(simpleDialogAccountPickerChimeraActivity, simpleDialogAccountPickerChimeraActivity.m);
                } else if (i == 2) {
                    intent3 = boinVar.b;
                    i = 2;
                } else {
                    intent3 = null;
                }
                if (intent3 != null) {
                    simpleDialogAccountPickerChimeraActivity.startActivityForResult(intent3, i);
                }
            }
        });
        this.n.d.g(this, new jvs() { // from class: asyq
            @Override // defpackage.jvs
            public final void a(Object obj) {
                final List list = (List) obj;
                if (list != null) {
                    final SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = SimpleDialogAccountPickerChimeraActivity.this;
                    simpleDialogAccountPickerChimeraActivity.getApplicationContext();
                    if (auqx.l(simpleDialogAccountPickerChimeraActivity)) {
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.add(new boif(null, null, 2, null));
                        list = arrayList;
                    }
                    final Account account = simpleDialogAccountPickerChimeraActivity.m.e;
                    if (simpleDialogAccountPickerChimeraActivity.p == -1 && account != null) {
                        simpleDialogAccountPickerChimeraActivity.p = elja.a(list, new ekvm() { // from class: asyj
                            @Override // defpackage.ekvm
                            public final boolean a(Object obj2) {
                                auad auadVar = SimpleDialogAccountPickerChimeraActivity.j;
                                return account.name.equals(((boif) obj2).c);
                            }
                        });
                    }
                    String string = TextUtils.isEmpty(simpleDialogAccountPickerChimeraActivity.m.g) ? simpleDialogAccountPickerChimeraActivity.getString(R.string.common_account_choose_account_for_app_label, new Object[]{simpleDialogAccountPickerChimeraActivity.k}) : simpleDialogAccountPickerChimeraActivity.m.g;
                    ip ipVar = new ip(simpleDialogAccountPickerChimeraActivity);
                    ipVar.setTitle(string);
                    ipVar.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: asyk
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            List list2 = list;
                            SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity2 = SimpleDialogAccountPickerChimeraActivity.this;
                            simpleDialogAccountPickerChimeraActivity2.n.a((boif) list2.get(simpleDialogAccountPickerChimeraActivity2.p));
                        }
                    });
                    ipVar.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: asyl
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            SimpleDialogAccountPickerChimeraActivity.this.onBackPressed();
                        }
                    });
                    String[] strArr = new String[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        boif boifVar = (boif) list.get(i);
                        int i2 = boifVar.a;
                        if (i2 == 0) {
                            String str = boifVar.c;
                            ekvl.y(str);
                            strArr[i] = str;
                        } else if (i2 == 2) {
                            strArr[i] = simpleDialogAccountPickerChimeraActivity.getResources().getString(R.string.common_add_account);
                        }
                    }
                    ipVar.s(strArr, simpleDialogAccountPickerChimeraActivity.p, new DialogInterface.OnClickListener() { // from class: asym
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            auad auadVar = SimpleDialogAccountPickerChimeraActivity.j;
                        }
                    });
                    final iq create = ipVar.create();
                    try {
                        Method declaredMethod = create.getClass().getDeclaredMethod("onCreate", Bundle.class);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(create, null);
                        create.b(-1).setEnabled(simpleDialogAccountPickerChimeraActivity.p >= 0);
                        simpleDialogAccountPickerChimeraActivity.o = create.c();
                        simpleDialogAccountPickerChimeraActivity.o.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: asyn
                            @Override // android.widget.AdapterView.OnItemClickListener
                            public final void onItemClick(AdapterView adapterView, View view, int i3, long j2) {
                                SimpleDialogAccountPickerChimeraActivity.this.p = i3;
                                create.b(-1).setEnabled(true);
                            }
                        });
                        Window window = create.getWindow();
                        if (window != null) {
                            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                            ViewGroup viewGroup2 = (ViewGroup) simpleDialogAccountPickerChimeraActivity.getWindow().getDecorView();
                            int[] iArr = iwe.a;
                            ivv.j(viewGroup2, ivv.a(viewGroup));
                            ivv.j(viewGroup, 0.0f);
                            viewGroup2.setBackground(viewGroup.getBackground());
                            viewGroup.setBackground(null);
                            View childAt = viewGroup.getChildAt(0);
                            viewGroup.removeViewAt(0);
                            simpleDialogAccountPickerChimeraActivity.setContentView(childAt);
                        }
                    } catch (Exception e) {
                        SimpleDialogAccountPickerChimeraActivity.j.g("Cannot call onCreate on Dialog", e, new Object[0]);
                        simpleDialogAccountPickerChimeraActivity.setResult(0);
                        simpleDialogAccountPickerChimeraActivity.finish();
                    }
                }
            }
        });
        this.n.f();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        this.n.g();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("key-selected-item", this.p);
    }
}
