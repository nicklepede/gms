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
import defpackage.aqwn;
import defpackage.aqwo;
import defpackage.arxo;
import defpackage.bmbu;
import defpackage.bmbw;
import defpackage.fsbr;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SimpleDialogAccountPickerChimeraActivity extends qet {
    public static final arxo j = new arxo("CommonAccount", "SimpleAccountPicker");
    public String k;
    public String l;
    public aqwn m;
    public bmbw n;
    public ListView o;
    public int p = -1;

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.n.e(i, i2, intent);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        Intent intent2 = null;
        if (intent != null) {
            Intent a = aqwo.a(intent, this, false);
            if (a != null) {
                aqwn aqwnVar = new aqwn(a, 3);
                this.m = aqwnVar;
                setTheme(aqwnVar.i);
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
        this.k = aqwo.b(getApplication(), this.l);
        bmbu bmbuVar = new bmbu(getApplicationContext(), this.l, fsbr.d());
        aqwn aqwnVar2 = this.m;
        bmbuVar.g = aqwnVar2.d;
        bmbuVar.d(aqwnVar2.a);
        aqwn aqwnVar3 = this.m;
        bmbuVar.b = aqwnVar3.b;
        bmbuVar.f = aqwnVar3.m;
        getApplicationContext();
        bmbuVar.h = false;
        bmbuVar.e = this.m.l;
        bmbw bmbwVar = (bmbw) new jrh(this, bmbuVar).a(bmbw.class);
        this.n = bmbwVar;
        bmbwVar.e.g(this, new jpd() { // from class: aqvz
            @Override // defpackage.jpd
            public final void a(Object obj) {
                Bundle extras;
                String string;
                bmbv bmbvVar = (bmbv) obj;
                if (bmbvVar == null) {
                    return;
                }
                SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = SimpleDialogAccountPickerChimeraActivity.this;
                int i = bmbvVar.a;
                Intent intent3 = bmbvVar.b;
                if (i == 10) {
                    Toast.makeText(simpleDialogAccountPickerChimeraActivity, R.string.common_account_restricted_no_accounts, 0).show();
                    i = 0;
                } else if (i == -1 && intent3 != null && simpleDialogAccountPickerChimeraActivity.m.c && (extras = intent3.getExtras()) != null && (string = extras.getString("authAccount")) != null) {
                    arut.d(simpleDialogAccountPickerChimeraActivity, string, simpleDialogAccountPickerChimeraActivity.l);
                }
                if (intent3 == null) {
                    simpleDialogAccountPickerChimeraActivity.setResult(i);
                } else {
                    simpleDialogAccountPickerChimeraActivity.setResult(i, intent3);
                }
                simpleDialogAccountPickerChimeraActivity.finish();
            }
        });
        this.n.f.g(this, new jpd() { // from class: aqwa
            @Override // defpackage.jpd
            public final void a(Object obj) {
                Intent intent3;
                bmbv bmbvVar = (bmbv) obj;
                if (bmbvVar == null) {
                    return;
                }
                SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = SimpleDialogAccountPickerChimeraActivity.this;
                int i = bmbvVar.a;
                if (i == 1) {
                    intent3 = AccountTypePickerChimeraActivity.a(simpleDialogAccountPickerChimeraActivity, simpleDialogAccountPickerChimeraActivity.m);
                } else if (i == 2) {
                    intent3 = bmbvVar.b;
                    i = 2;
                } else {
                    intent3 = null;
                }
                if (intent3 != null) {
                    simpleDialogAccountPickerChimeraActivity.startActivityForResult(intent3, i);
                }
            }
        });
        this.n.d.g(this, new jpd() { // from class: aqwb
            @Override // defpackage.jpd
            public final void a(Object obj) {
                final List list = (List) obj;
                if (list != null) {
                    final SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = SimpleDialogAccountPickerChimeraActivity.this;
                    simpleDialogAccountPickerChimeraActivity.getApplicationContext();
                    if (asnd.l(simpleDialogAccountPickerChimeraActivity)) {
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.add(new bmbn(null, null, 2, null));
                        list = arrayList;
                    }
                    final Account account = simpleDialogAccountPickerChimeraActivity.m.e;
                    if (simpleDialogAccountPickerChimeraActivity.p == -1 && account != null) {
                        simpleDialogAccountPickerChimeraActivity.p = eivv.a(list, new eiih() { // from class: aqvu
                            @Override // defpackage.eiih
                            public final boolean a(Object obj2) {
                                arxo arxoVar = SimpleDialogAccountPickerChimeraActivity.j;
                                return account.name.equals(((bmbn) obj2).c);
                            }
                        });
                    }
                    String string = TextUtils.isEmpty(simpleDialogAccountPickerChimeraActivity.m.g) ? simpleDialogAccountPickerChimeraActivity.getString(R.string.common_account_choose_account_for_app_label, new Object[]{simpleDialogAccountPickerChimeraActivity.k}) : simpleDialogAccountPickerChimeraActivity.m.g;
                    ip ipVar = new ip(simpleDialogAccountPickerChimeraActivity);
                    ipVar.setTitle(string);
                    ipVar.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: aqvv
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            List list2 = list;
                            SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity2 = SimpleDialogAccountPickerChimeraActivity.this;
                            simpleDialogAccountPickerChimeraActivity2.n.a((bmbn) list2.get(simpleDialogAccountPickerChimeraActivity2.p));
                        }
                    });
                    ipVar.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: aqvw
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            SimpleDialogAccountPickerChimeraActivity.this.onBackPressed();
                        }
                    });
                    String[] strArr = new String[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        bmbn bmbnVar = (bmbn) list.get(i);
                        int i2 = bmbnVar.a;
                        if (i2 == 0) {
                            String str = bmbnVar.c;
                            eiig.x(str);
                            strArr[i] = str;
                        } else if (i2 == 2) {
                            strArr[i] = simpleDialogAccountPickerChimeraActivity.getResources().getString(R.string.common_add_account);
                        }
                    }
                    ipVar.s(strArr, simpleDialogAccountPickerChimeraActivity.p, new DialogInterface.OnClickListener() { // from class: aqvx
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            arxo arxoVar = SimpleDialogAccountPickerChimeraActivity.j;
                        }
                    });
                    final iq create = ipVar.create();
                    try {
                        Method declaredMethod = create.getClass().getDeclaredMethod("onCreate", Bundle.class);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(create, null);
                        create.b(-1).setEnabled(simpleDialogAccountPickerChimeraActivity.p >= 0);
                        simpleDialogAccountPickerChimeraActivity.o = create.c();
                        simpleDialogAccountPickerChimeraActivity.o.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: aqvy
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
                            int[] iArr = iuo.a;
                            iuf.j(viewGroup2, iuf.a(viewGroup));
                            iuf.j(viewGroup, 0.0f);
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

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        this.n.g();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("key-selected-item", this.p);
    }
}
