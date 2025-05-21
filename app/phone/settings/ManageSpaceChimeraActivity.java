package com.google.android.gms.app.phone.settings;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.app.phone.settings.ManageSpaceChimeraActivity;
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import defpackage.aqwv;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asqh;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.bzff;
import defpackage.cyjo;
import defpackage.cylp;
import defpackage.dfae;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.djks;
import defpackage.dxpj;
import defpackage.dxpm;
import defpackage.dxpo;
import defpackage.dxpu;
import defpackage.dxqz;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.fmxu;
import defpackage.fpzx;
import defpackage.fvbo;
import defpackage.ips;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.tow;
import defpackage.tox;
import defpackage.tpe;
import defpackage.tpf;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ManageSpaceChimeraActivity extends qet implements View.OnClickListener {
    public TextView j;
    public TextView k;
    public TextView l;
    private Button m;
    private Button n;
    private CharSequence o;
    private Button p;
    private TextView q;
    private tow r;
    private bqqa s;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.m) {
            bqqa.a(aseu.CORE_PHONE_STORAGE_MANAGE_ICING);
            startActivity(new Intent().setClassName(this, "com.google.android.gms.icing.ui.IcingManageSpaceActivity"));
            return;
        }
        if (view == this.n) {
            bqqa.a(aseu.CORE_PHONE_STORAGE_CLEAR_DATA);
            String str = (String) this.r.i.hT();
            eiig.x(str);
            new AlertDialog.Builder(this).setTitle(getText(R.string.icing_storage_management_clear_all_data_dlg_title)).setIconAttribute(android.R.attr.alertDialogIcon).setMessage(Html.fromHtml(str)).setPositiveButton(R.string.common_ui_confirm_deleting_button, new DialogInterface.OnClickListener() { // from class: tpa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    boolean a = fndr.a.a().a();
                    ManageSpaceChimeraActivity manageSpaceChimeraActivity = ManageSpaceChimeraActivity.this;
                    if (!a) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.putNull("gms:ads:ads_identifier:adid_key");
                        contentValues.putNull("gms:ads:ads_identifier:enable_limit_ad_tracking");
                        manageSpaceChimeraActivity.getContentResolver().update(new Uri.Builder().scheme("content").authority("com.google.android.gsf.gservices").appendPath("override").build(), contentValues, null, null);
                    }
                    ActivityManager activityManager = (ActivityManager) manageSpaceChimeraActivity.getSystemService("activity");
                    eike.e(activityManager);
                    activityManager.clearApplicationUserData();
                }
            }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
            return;
        }
        if (view == this.p) {
            bqqa.a(aseu.CORE_PHONE_STORAGE_MANAGE_WEARABLE);
            startActivity(new Intent("com.google.android.gms.wearable.STORAGE_SETTINGS").setPackage(getPackageName()));
        } else if (view == this.q) {
            bqqa.a(aseu.CORE_PHONE_STORAGE_MANAGE_PASSWORDS);
            dfaq a = this.r.c.a(new CredentialManagerAccount("pwm.constant.LocalAccount"), new CallerInfo("gmscore", "android", "gmscore_deletion_dialog", ""));
            a.z(new dfak() { // from class: tor
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    tow.a((PendingIntent) obj);
                }
            });
            a.y(new dfah() { // from class: tos
                @Override // defpackage.dfah
                public final void gm(Exception exc) {
                    ((ejhf) ((ejhf) tow.a.j()).s(exc)).x("Error getting credential manager intent");
                }
            });
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        if (fpzx.c() && asqh.c()) {
            startActivity(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.managestorage.ui.ManageStorageActivity"));
            finish();
        }
        super.onCreate(bundle);
        setContentView(R.layout.manage_space_activity);
        int i = ips.a;
        this.o = getText(R.string.storage_managment_computing_size);
        this.j = (TextView) findViewById(R.id.icing_storage_size_text);
        Button button = (Button) findViewById(R.id.manage_icing_storage);
        this.m = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.manage_wear_storage);
        this.p = button2;
        button2.setOnClickListener(this);
        this.k = (TextView) findViewById(R.id.wear_storage_size_text);
        findViewById(R.id.clear_all_data_section);
        this.l = (TextView) findViewById(R.id.total_storage_size_text);
        Button button3 = (Button) findViewById(R.id.clear_all_data);
        this.n = button3;
        button3.setOnClickListener(this);
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.nr_passwords_data_container);
        final TextView textView = (TextView) findViewById(R.id.total_passwords_text);
        final LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.password_export_disclaimer);
        final TextView textView2 = (TextView) findViewById(R.id.password_export_disclaimer_text);
        TextView textView3 = (TextView) findViewById(R.id.password_export_disclaimer_export_button);
        this.q = textView3;
        textView3.setOnClickListener(this);
        ((TextView) findViewById(R.id.all_storage_description)).setText(R.string.storage_management_all_storage_descriptive_text_new);
        tow towVar = (tow) new jrh(this, new tox(this)).a(tow.class);
        this.r = towVar;
        towVar.e.g(this, new jpd() { // from class: tpc
            @Override // defpackage.jpd
            public final void a(Object obj) {
                linearLayout.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
            }
        });
        jpc jpcVar = this.r.f;
        Objects.requireNonNull(textView);
        jpcVar.g(this, new jpd() { // from class: tpd
            @Override // defpackage.jpd
            public final void a(Object obj) {
                textView.setText((String) obj);
            }
        });
        this.r.g.g(this, new jpd() { // from class: tpc
            @Override // defpackage.jpd
            public final void a(Object obj) {
                linearLayout2.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
            }
        });
        jpc jpcVar2 = this.r.h;
        Objects.requireNonNull(textView2);
        jpcVar2.g(this, new jpd() { // from class: tpd
            @Override // defpackage.jpd
            public final void a(Object obj) {
                textView2.setText((String) obj);
            }
        });
        jpc jpcVar3 = this.r.j;
        final TextView textView4 = this.q;
        jpcVar3.g(this, new jpd() { // from class: tpc
            @Override // defpackage.jpd
            public final void a(Object obj) {
                textView4.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
            }
        });
        eijr eijrVar = bqqe.a;
        this.s = new bqqa();
        dxpj.d(this, new dxqz() { // from class: tpb
            @Override // defpackage.dxqz
            public final ftwe a(String str) {
                return ftwg.k(str, 443).a();
            }
        });
        Activity containerActivity = getContainerActivity();
        asej asejVar = asej.CORE;
        fvbo.f(containerActivity, "activity");
        fvbo.f(asejVar, "serviceId");
        bzff bzffVar = new bzff(containerActivity, R.id.prompt_parent_sheet, asejVar, dxpo.FIRST_CARD_NON_MODAL, dxpm.CARD, null, null, null, null);
        Activity containerActivity2 = getContainerActivity();
        String a = fmxu.a.a().a();
        if (containerActivity2 == null) {
            throw new IllegalArgumentException("Client context is not set.");
        }
        if (TextUtils.isEmpty(a)) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        dxpj.c(new dxpu(containerActivity2, a, bzffVar, "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk", null, fmxu.a.a().b()));
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        this.j.setText(this.o);
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(this.o);
        }
        aqwv aqwvVar = cyjo.a;
        dfaq a = new cylp(this).a();
        a.z(new tpe(this));
        a.y(new dfah() { // from class: toy
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                Log.e("ManageSpaceActivity", "Unable to connect to Google Play Services for icing storage info.");
            }
        });
        dfaq ba = djks.c(this).ba();
        ba.z(new tpf(this));
        ba.y(new dfah() { // from class: toz
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                Log.e("ManageSpaceActivity", "Unable to connect to Google Play Services for wearble storage info.");
            }
        });
        final tow towVar = this.r;
        if (towVar.d != null) {
            return;
        }
        towVar.e.l(true);
        jpc jpcVar = towVar.f;
        Context context = towVar.b;
        jpcVar.l(context.getString(R.string.storage_managment_computing_size));
        towVar.g.l(false);
        towVar.i.l(context.getString(R.string.icing_storage_management_clear_all_data_dlg_text_unknown));
        towVar.j.l(false);
        dfaq b = towVar.l.b(Bundle.EMPTY);
        b.z(new dfak() { // from class: tot
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                int size = ((eitj) obj).size();
                tow towVar2 = tow.this;
                towVar2.e.l(true);
                Integer valueOf = Integer.valueOf(size);
                Context context2 = towVar2.b;
                towVar2.f.l(context2.getString(R.string.storage_management_nr_local_passwords, valueOf));
                towVar2.h.l(context2.getResources().getQuantityString(R.plurals.storage_management_nr_local_passwords_will_be_deleted, size, valueOf));
                boolean z = size > 0;
                jpc jpcVar2 = towVar2.g;
                Boolean valueOf2 = Boolean.valueOf(z);
                jpcVar2.l(valueOf2);
                towVar2.j.l(valueOf2);
                String string = size == 0 ? context2.getString(R.string.icing_storage_management_clear_all_data_dlg_text_new) : context2.getResources().getQuantityString(R.plurals.icing_storage_management_clear_all_data_dlg_text_with_passwords, size, valueOf);
                towVar2.i.l(string);
                towVar2.k.l(string);
            }
        });
        b.y(new dfah() { // from class: tou
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                ((ejhf) ((ejhf) tow.a.j()).s(exc)).x("Could not get number of local passwords");
                tow towVar2 = tow.this;
                towVar2.e.l(false);
                Context context2 = towVar2.b;
                towVar2.h.l(context2.getString(R.string.storage_management_nr_local_passwords_will_be_deleted_unknown));
                towVar2.g.l(true);
                towVar2.i.l(context2.getString(R.string.icing_storage_management_clear_all_data_dlg_text_unknown));
                towVar2.j.l(true);
                towVar2.k.l(context2.getString(R.string.icing_storage_management_clear_all_data_dlg_text_unknown));
            }
        });
        b.x(new dfae() { // from class: tov
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                tow.this.d = null;
            }
        });
        towVar.d = b;
    }
}
