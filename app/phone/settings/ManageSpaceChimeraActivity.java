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
import defpackage.aszk;
import defpackage.auid;
import defpackage.auio;
import defpackage.auub;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.cbnw;
import defpackage.datm;
import defpackage.davn;
import defpackage.dhlk;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dlwl;
import defpackage.eabk;
import defpackage.eabn;
import defpackage.eabp;
import defpackage.eabv;
import defpackage.eada;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.fppt;
import defpackage.fstu;
import defpackage.fxxm;
import defpackage.iri;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.vkw;
import defpackage.vkx;
import defpackage.vle;
import defpackage.vlf;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ManageSpaceChimeraActivity extends rxx implements View.OnClickListener {
    public TextView j;
    public TextView k;
    public TextView l;
    private Button m;
    private Button n;
    private CharSequence o;
    private Button p;
    private TextView q;
    private vkw r;
    private bsxr s;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.m) {
            bsxr.a(auio.CORE_PHONE_STORAGE_MANAGE_ICING);
            startActivity(new Intent().setClassName(this, "com.google.android.gms.icing.ui.IcingManageSpaceActivity"));
            return;
        }
        if (view == this.n) {
            bsxr.a(auio.CORE_PHONE_STORAGE_CLEAR_DATA);
            String str = (String) this.r.i.ii();
            ekvl.y(str);
            new AlertDialog.Builder(this).setTitle(getText(R.string.icing_storage_management_clear_all_data_dlg_title)).setIconAttribute(android.R.attr.alertDialogIcon).setMessage(Html.fromHtml(str)).setPositiveButton(R.string.common_ui_confirm_deleting_button, new DialogInterface.OnClickListener() { // from class: vla
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    boolean a = fpvq.a.lK().a();
                    ManageSpaceChimeraActivity manageSpaceChimeraActivity = ManageSpaceChimeraActivity.this;
                    if (!a) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.putNull("gms:ads:ads_identifier:adid_key");
                        contentValues.putNull("gms:ads:ads_identifier:enable_limit_ad_tracking");
                        manageSpaceChimeraActivity.getContentResolver().update(new Uri.Builder().scheme("content").authority("com.google.android.gsf.gservices").appendPath("override").build(), contentValues, null, null);
                    }
                    ActivityManager activityManager = (ActivityManager) manageSpaceChimeraActivity.getSystemService("activity");
                    ekxj.e(activityManager);
                    activityManager.clearApplicationUserData();
                }
            }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
            return;
        }
        if (view == this.p) {
            bsxr.a(auio.CORE_PHONE_STORAGE_MANAGE_WEARABLE);
            startActivity(new Intent("com.google.android.gms.wearable.STORAGE_SETTINGS").setPackage(getPackageName()));
        } else if (view == this.q) {
            bsxr.a(auio.CORE_PHONE_STORAGE_MANAGE_PASSWORDS);
            dhlw a = this.r.c.a(new CredentialManagerAccount("pwm.constant.LocalAccount"), new CallerInfo("gmscore", "android", "gmscore_deletion_dialog", ""));
            a.z(new dhlq() { // from class: vkr
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    vkw.a((PendingIntent) obj);
                }
            });
            a.y(new dhln() { // from class: vks
                @Override // defpackage.dhln
                public final void gB(Exception exc) {
                    ((eluo) ((eluo) vkw.a.j()).s(exc)).x("Error getting credential manager intent");
                }
            });
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        if (fstu.c() && auub.c()) {
            startActivity(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.managestorage.ui.ManageStorageActivity"));
            finish();
        }
        super.onCreate(bundle);
        setContentView(R.layout.manage_space_activity);
        int i = iri.a;
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
        vkw vkwVar = (vkw) new jxw(this, new vkx(this)).a(vkw.class);
        this.r = vkwVar;
        vkwVar.e.g(this, new jvs() { // from class: vlc
            @Override // defpackage.jvs
            public final void a(Object obj) {
                linearLayout.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
            }
        });
        jvr jvrVar = this.r.f;
        Objects.requireNonNull(textView);
        jvrVar.g(this, new jvs() { // from class: vld
            @Override // defpackage.jvs
            public final void a(Object obj) {
                textView.setText((String) obj);
            }
        });
        this.r.g.g(this, new jvs() { // from class: vlc
            @Override // defpackage.jvs
            public final void a(Object obj) {
                linearLayout2.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
            }
        });
        jvr jvrVar2 = this.r.h;
        Objects.requireNonNull(textView2);
        jvrVar2.g(this, new jvs() { // from class: vld
            @Override // defpackage.jvs
            public final void a(Object obj) {
                textView2.setText((String) obj);
            }
        });
        jvr jvrVar3 = this.r.j;
        final TextView textView4 = this.q;
        jvrVar3.g(this, new jvs() { // from class: vlc
            @Override // defpackage.jvs
            public final void a(Object obj) {
                textView4.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
            }
        });
        ekww ekwwVar = bsxv.a;
        this.s = new bsxr();
        eabk.d(this, new eada() { // from class: vlb
            @Override // defpackage.eada
            public final fwsc a(String str) {
                return fwse.k(str, 443).a();
            }
        });
        Activity containerActivity = getContainerActivity();
        auid auidVar = auid.CORE;
        fxxm.f(containerActivity, "activity");
        fxxm.f(auidVar, "serviceId");
        cbnw cbnwVar = new cbnw(containerActivity, R.id.prompt_parent_sheet, auidVar, eabp.FIRST_CARD_NON_MODAL, eabn.CARD, null, null, null, null);
        Activity containerActivity2 = getContainerActivity();
        fppt fpptVar = fppt.a;
        String a = fpptVar.lK().a();
        if (containerActivity2 == null) {
            throw new IllegalArgumentException("Client context is not set.");
        }
        if (TextUtils.isEmpty(a)) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        eabk.c(new eabv(containerActivity2, a, cbnwVar, "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk", null, fpptVar.lK().b()));
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        this.j.setText(this.o);
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(this.o);
        }
        aszk aszkVar = datm.a;
        dhlw a = new davn(this).a();
        a.z(new vle(this));
        a.y(new dhln() { // from class: vky
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                Log.e("ManageSpaceActivity", "Unable to connect to Google Play Services for icing storage info.");
            }
        });
        dhlw aZ = dlwl.c(this).aZ();
        aZ.z(new vlf(this));
        aZ.y(new dhln() { // from class: vkz
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                Log.e("ManageSpaceActivity", "Unable to connect to Google Play Services for wearble storage info.");
            }
        });
        final vkw vkwVar = this.r;
        if (vkwVar.d != null) {
            return;
        }
        vkwVar.e.l(true);
        jvr jvrVar = vkwVar.f;
        Context context = vkwVar.b;
        jvrVar.l(context.getString(R.string.storage_managment_computing_size));
        vkwVar.g.l(false);
        vkwVar.i.l(context.getString(R.string.icing_storage_management_clear_all_data_dlg_text_unknown));
        vkwVar.j.l(false);
        dhlw b = vkwVar.l.b(Bundle.EMPTY);
        b.z(new dhlq() { // from class: vkt
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                int size = ((elgo) obj).size();
                vkw vkwVar2 = vkw.this;
                vkwVar2.e.l(true);
                Integer valueOf = Integer.valueOf(size);
                Context context2 = vkwVar2.b;
                vkwVar2.f.l(context2.getString(R.string.storage_management_nr_local_passwords, valueOf));
                vkwVar2.h.l(context2.getResources().getQuantityString(R.plurals.storage_management_nr_local_passwords_will_be_deleted, size, valueOf));
                boolean z = size > 0;
                jvr jvrVar2 = vkwVar2.g;
                Boolean valueOf2 = Boolean.valueOf(z);
                jvrVar2.l(valueOf2);
                vkwVar2.j.l(valueOf2);
                String string = size == 0 ? context2.getString(R.string.icing_storage_management_clear_all_data_dlg_text_new) : context2.getResources().getQuantityString(R.plurals.icing_storage_management_clear_all_data_dlg_text_with_passwords, size, valueOf);
                vkwVar2.i.l(string);
                vkwVar2.k.l(string);
            }
        });
        b.y(new dhln() { // from class: vku
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ((eluo) ((eluo) vkw.a.j()).s(exc)).x("Could not get number of local passwords");
                vkw vkwVar2 = vkw.this;
                vkwVar2.e.l(false);
                Context context2 = vkwVar2.b;
                vkwVar2.h.l(context2.getString(R.string.storage_management_nr_local_passwords_will_be_deleted_unknown));
                vkwVar2.g.l(true);
                vkwVar2.i.l(context2.getString(R.string.icing_storage_management_clear_all_data_dlg_text_unknown));
                vkwVar2.j.l(true);
                vkwVar2.k.l(context2.getString(R.string.icing_storage_management_clear_all_data_dlg_text_unknown));
            }
        });
        b.x(new dhlk() { // from class: vkv
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                vkw.this.d = null;
            }
        });
        vkwVar.d = b;
    }
}
