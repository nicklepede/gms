package com.google.android.gms.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ShowTextChimeraActivity;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bals;
import defpackage.baol;
import defpackage.bivs;
import defpackage.dozi;
import defpackage.dxry;
import defpackage.dxsa;
import defpackage.eble;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.fnvm;
import defpackage.fnvv;
import defpackage.qet;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ShowTextChimeraActivity extends qet {
    public static final asot j = asot.b("gf_ShowTextActivity", asej.FEEDBACK);
    private final ensv k = new asmf(Integer.MAX_VALUE, 9);

    private final void l(String str) {
        findViewById(R.id.text_in_list_view).setVisibility(8);
        View findViewById = findViewById(R.id.text_scroll_view);
        View findViewById2 = findViewById(R.id.empty_view);
        if (str == null) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
        } else {
            findViewById.setVisibility(0);
            ((TextView) findViewById(R.id.text)).setText(str);
            findViewById2.setVisibility(8);
        }
    }

    final String a(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void k(String[] strArr) {
        findViewById(R.id.text_scroll_view).setVisibility(8);
        View findViewById = findViewById(R.id.empty_view);
        ListView listView = (ListView) findViewById(R.id.text_in_list_view);
        if (strArr == null || strArr.length == 0) {
            findViewById.setVisibility(0);
            listView.setVisibility(8);
            return;
        }
        findViewById.setVisibility(8);
        listView.setVisibility(0);
        listView.setAdapter((ListAdapter) new ArrayAdapter(this, R.layout.simple_list_item_material, strArr));
        listView.setDivider(null);
        listView.setDividerHeight(0);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        ServiceDump[] serviceDumpArr;
        super.onCreate(bundle);
        ErrorReport b = baol.b();
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("feedback.FIELD_NAME", 0);
        if (b == null || intExtra == 0) {
            finish();
            return;
        }
        if (intent.getBooleanExtra("extra_theme_dialog", false)) {
            bivs.b(this, b, R.style.Feedback_Activity_Dialog_Theme, R.style.Feedback_Activity_Dialog_Theme_Dark, R.style.Feedback_Activity_Dialog_Theme_DayNight);
        } else {
            bivs.b(this, b, R.style.Feedback_Activity_Theme_Light, R.style.Feedback_Activity_Theme_Dark, R.style.Feedback_Activity_Theme_DayNight);
        }
        setContentView(R.layout.show_text_activity);
        if (fnvm.c()) {
            int i = eble.a;
            findViewById(R.id.ll_parent_show_text_activity).setBackgroundColor(dozi.b(R.dimen.gm3_sys_elevation_level2, this));
        }
        if (fnvv.a.a().a()) {
            dxsa.a(findViewById(R.id.ll_parent_show_text_activity), dxry.c);
        }
        String a = a(intExtra, new Object[0]);
        String stringExtra = intent.getStringExtra("feedback.FIELD_VALUE");
        if (TextUtils.equals(stringExtra, "running applications")) {
            k(b.q);
        } else if (TextUtils.equals(stringExtra, "system logs")) {
            k(b.r);
        } else if (TextUtils.equals(stringExtra, "event logs")) {
            k(b.s);
        } else if (TextUtils.equals(stringExtra, "system full logs")) {
            k(b.ak);
        } else if (TextUtils.equals(stringExtra, "main full logs")) {
            k(b.al);
        } else if (TextUtils.equals(stringExtra, "content capture dump")) {
            k(b.am);
        } else if (TextUtils.equals(stringExtra, "stack trace")) {
            l(b.a.crashInfo.stackTrace);
        } else if (TextUtils.equals(stringExtra, "anr info")) {
            l(b.a.anrInfo.info);
        } else if (TextUtils.equals(stringExtra, "anr stack trace")) {
            l(b.t);
        } else if (TextUtils.equals(stringExtra, "battery usage details")) {
            l(b.a.batteryInfo.usageDetails);
        } else if (TextUtils.equals(stringExtra, "battery checkin details")) {
            l(b.a.batteryInfo.checkinDetails);
        } else if (TextUtils.equals(stringExtra, "running service details")) {
            l(b.a.runningServiceInfo.serviceDetails);
        } else if (TextUtils.equals(stringExtra, "service dump")) {
            String stringExtra2 = intent.getStringExtra("feedback.OBJECT_VALUE");
            a = a(R.string.gf_service_dump_title, stringExtra2);
            String[] strArr = null;
            if (stringExtra2 != null && (serviceDumpArr = b.ar) != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= serviceDumpArr.length) {
                        break;
                    }
                    ServiceDump serviceDump = serviceDumpArr[i2];
                    ServiceDumpRequest serviceDumpRequest = serviceDump.a;
                    if (!serviceDumpRequest.a.equals(stringExtra2)) {
                        i2++;
                    } else if (serviceDumpRequest.d == 1) {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(serviceDump.b), StandardCharsets.UTF_8));
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                } else {
                                    arrayList.add(readLine);
                                }
                            }
                            strArr = (String[]) arrayList.toArray(new String[0]);
                        } catch (IOException e) {
                            ((ejhf) ((ejhf) ((ejhf) j.i()).s(e)).ah((char) 3633)).x("Unable to convert bytes to Strings");
                            strArr = new String[]{"Unable to convert bytes to Strings"};
                        }
                    } else {
                        strArr = new String[]{a(R.string.gf_service_dump_binary_data, new Object[0])};
                    }
                }
            }
            k(strArr);
        } else if (TextUtils.equals(stringExtra, "product specific binary file path")) {
            String stringExtra3 = intent.getStringExtra("feedback.OBJECT_VALUE");
            a = a(R.string.gf_product_specific_data_file_title, stringExtra3);
            new bals(stringExtra3, this).executeOnExecutor(this.k, new Void[0]);
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.toolbar_show_text_activity);
        materialToolbar.B(a);
        materialToolbar.w(new View.OnClickListener() { // from class: balr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShowTextChimeraActivity.this.finish();
            }
        });
    }
}
